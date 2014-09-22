package org.evesim.http;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.evesim.EveComponent;
import org.evesim.EveComponentRegistry;
import org.evesim.EveSimServerSession;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;
import org.evesim.msg.EveMessage;

/**
 * This servlet provides the REST interface for the server nodes deployed on the
 * network.<br>
 * <br>
 * The API for calling the interface is as follows: <br>
 * <code>http://hostname:port/eve/{sessionid}/{command}</code><br>
 * where <b>sessionid</b> is a UUID following OSF standard <a
 * href="http://en.wikipedia.org/wiki/Universally_Unique_Identifier">UUID</a>
 * and command is one of the following commands: <br>
 * <ul>
 * <li><b>init</b> This command requires the initial data to be sent as XMI in a
 * POST request.
 * <li><b>start</b> This command start the simulation at this specific node
 * <li><b>msg</b> Returns the current enqueued messages in a message bundle as
 * XMI
 * </ul>
 * <br>
 * Example:
 * <code>http://localhost:8080/eve/550e8400-e29b-11d4-a716-446655440000/msg</code>
 * 
 * @author reder
 * 
 */
public class EveSimServerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3536674520150073254L;

	public static String EVE_URI = "/eve/";

	private final static Logger logger = Logger.getLogger(EveSimServerServlet.class.getName());

	private EvesimFactory factory = null;

	public EveSimServerServlet() {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		handleRequest(req, resp);
	}

	/**
	 * This method dumps the sent data into a temporary file an returns a
	 * filename.
	 * 
	 * @param in
	 * @return
	 * @throws IOException
	 */
	public static String createTmpFile(InputStream in) throws IOException {
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader r = new BufferedReader(inr);

		File f = File.createTempFile(UUID.randomUUID().toString(), ".evesim");
		f.deleteOnExit();
		FileOutputStream fout = new FileOutputStream(f);
		OutputStreamWriter outw = new OutputStreamWriter(fout);

		while (r.ready()) {
			String t = r.readLine();
			outw.write(t);
		}
		outw.flush();
		outw.close();
		r.close();

		return f.getAbsolutePath();
	}

	private void doEveInit(HttpServletRequest req, HttpServletResponse resp, EveSimServerSession session) throws ServletException, IOException {
		/*
		 * // Register the XMI resource factory for the .website extension
		 * Resource
		 * .Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new
		 * XMIResourceFactoryImpl() { public Resource
		 * createResource(org.eclipse.emf.common.util.URI uri) { XMIResource
		 * xmiResource = new XMIResourceImpl(uri); return xmiResource; } });
		 */
		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		String fileName = createTmpFile(req.getInputStream());
		// REDER: Quick and dirty solution for problems running this on windows-
		// TODO: find "cleaner way".
		fileName = fileName.replace('\\', '/');
		fileName = "file:///" + fileName;
		System.out.println("File: " + fileName);

		Resource resource = resSet.getResource(org.eclipse.emf.common.util.URI.createURI(fileName), true);
		resource.load(Collections.EMPTY_MAP);
		EveComponent rootComponent = (EveComponent) resource.getContents().get(0);

		session.setRootComponent(rootComponent);

		sendOk(resp);
	}

	protected void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String requestString = req.getRequestURI();
		String[] parts = requestString.substring(requestString.indexOf(EVE_URI) + EVE_URI.length()).split("/");

		UUID sessionId = UUID.fromString(parts[0]);
		String cmd = parts[1];

		EveSimServerSession session = EveComponentRegistry.getInstance().getSession(sessionId);

		if (cmd.equals("start")) {
			doEveStart(req, resp, session);
		} else if (cmd.equals("stop")) {
			doEveStop(req, resp, session);
		} else if (cmd.equals("init")) {
			doEveInit(req, resp, session);
		} else if (cmd.equals("delete")) {
			doEveDelete(req, resp, session);
		} else if (cmd.equals("msg")) {
			doEveMsg(req, resp, session);
		} else {
			throw new ServletException("Invalid command: '" + cmd + "'.");
		}
	}

	private void doEveDelete(HttpServletRequest req, HttpServletResponse resp, EveSimServerSession session) {
		session.dispose();
		session = null;
		sendOk(resp);
		
	}

	private void doEveStop(HttpServletRequest req, HttpServletResponse resp, EveSimServerSession session) {
		session.stopAllAgents();
		sendOk(resp);
	}

	private void sendOk(HttpServletResponse resp) {
		resp.setContentType("text/text");
		Writer out;
		try {
			out = resp.getWriter();
			resp.getWriter().println("OK");
			out.close();
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Could not respond to GET request: start", e);
		}
	}

	private void doEveStart(HttpServletRequest req, HttpServletResponse resp, EveSimServerSession session) {
		session.startAllAgents();

		sendOk(resp);
	}

	private void doEveMsg(HttpServletRequest req, HttpServletResponse resp, EveSimServerSession session) {
		EveMessage msg = session.getMessages();

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Create a resource
		Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI("evesim/test.evesim"));
		resource.getContents().add(msg);

		try {
			BufferedOutputStream bs = new BufferedOutputStream(resp.getOutputStream());
			resource.save(bs, Collections.EMPTY_MAP);
			bs.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void init() throws ServletException {
		super.init();

		// Initialize the model
		EvesimPackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		EvesimFactory factory = EvesimFactory.eINSTANCE;

		// Register the XMI resource factory for the .website extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("evesim", new XMIResourceFactoryImpl());

	}

}
