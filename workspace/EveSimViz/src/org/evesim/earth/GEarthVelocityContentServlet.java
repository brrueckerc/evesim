package org.evesim.earth;

import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.log.LogChute;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

/**
 * @author reder
 * 
 */
class GEarthVelocityContentServlet extends HttpServlet implements LogChute {
	public final static String WEB_RESOURCE_ROOT = "/web";
	public final static String SERVLET_CONTEXT = "/vml";

	private boolean initialized = false;
	private boolean velocityInitialized = false;

	private VelocityEngine vengine = null;

	final static Logger logger = Logger.getLogger(GEarthVelocityContentServlet.class.getName());

	/**
	 * Initializes the velocity engine
	 */
	public void initVelocityEngine() {
		vengine = new VelocityEngine();
		vengine.setProperty(Velocity.RUNTIME_LOG_LOGSYSTEM, this);
		Properties props = new Properties();
		props.setProperty(VelocityEngine.RESOURCE_LOADER, "classpath");
		props.setProperty("classpath." + VelocityEngine.RESOURCE_LOADER + ".class", ClasspathResourceLoader.class.getName());

		try {
			vengine.init(props);
			velocityInitialized = true;
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Velocity engine not available. Visualisations may not work.", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		initVelocityEngine();

		try {
			super.init(config);
			Enumeration<URL> t = this.getClass().getClassLoader().getResources(WEB_RESOURCE_ROOT + "/webroot.txt");
			if (!t.hasMoreElements()) {
				logger.log(Level.SEVERE, "Web resources not available. Visualisations may not work. "
						+ "Please check if 'webroot.txt' is existing in the specified directory.");
			}
		} catch (IOException ex) {
			logger.log(Level.SEVERE, "Web resources not available. Visualisations may not work.", ex);
		}

		initialized = true;
	}

	/**
	 * Populates the velocity context with the variables that can be used in the
	 * velocity template
	 * 
	 * @param request
	 * @return
	 */
	protected VelocityContext createVelocityContext(HttpServletRequest request) {
		VelocityContext result = new VelocityContext();

		String port = String.valueOf(GEarthViewController.getInstance().getWebServerPort());
		String sessionId = request.getParameter("sid");

		result.put("webserver_port", port);
		result.put("static_context", GEarthUtil.getStaticServletBase());
		
		if (sessionId != null) {
			result.put("session", sessionId);
			result.put("kml_url", GEarthUtil.getKMLUriForSession(UUID.fromString(sessionId)));
			
			GEarthSession session = GEarthViewController.getInstance().getSession(UUID.fromString(sessionId));
			result.put("root",session.getRootComponent());
		}

		return result;
	}

	/**
	 * Process the request using the velocity engine. The
	 * {@link GEartStaticContentServlet} does the same without using the
	 * velocity engine.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// check if instance is initialized
		if (!initialized || !velocityInitialized) {
			handleError(request, response, "GEarthVelocityContentServlet not initialized. See error log for details.");
			return;
		}

		// get template name from request and get template from engine
		String filename = getTemplateFileName(request);
		Template template = getTemplate(filename);

		logger.log(Level.INFO, "Loading Velocity template: " + filename);

		// process template and send to client
		Writer out = response.getWriter();
		template.merge(createVelocityContext(request), out);
		out.flush();
		out.close();
	}

	/**
	 * Returns the template filename from the servlet request
	 * 
	 * @param request
	 * @return
	 */
	private String getTemplateFileName(HttpServletRequest request) {
		int idx = request.getRequestURL().indexOf(SERVLET_CONTEXT);
		idx = idx + SERVLET_CONTEXT.length();

		String filename = WEB_RESOURCE_ROOT + request.getRequestURL().substring(idx);
		return filename;
	}

	/**
	 * Returns the template corresponding to the template name
	 * 
	 * @param templateFile
	 * @return
	 * @throws ServletException
	 */
	private Template getTemplate(String templateFile) throws ServletException {
		try {
			return vengine.getTemplate(templateFile);
		} catch (ResourceNotFoundException e) {
			logger.log(Level.SEVERE, "Cannot find velocity template " + templateFile, e);
			throw new ServletException(e);
		} catch (ParseErrorException e) {
			logger.log(Level.SEVERE, "Syntax error in velocity template " + templateFile, e);
			throw new ServletException(e);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error loading velocity template " + templateFile, e);
			throw new ServletException(e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request, response);
	}

	protected void handleError(HttpServletRequest request, HttpServletResponse response, String error) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("<h1>ERROR</h1>");
		response.getWriter().println("<p>" + error + "</p>");
	}

	protected void handleFile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	@Override
	public void init(RuntimeServices arg0) throws Exception {
	}

	@Override
	public boolean isLevelEnabled(int arg0) {
		return true;
	}

	@Override
	public void log(int arg0, String arg1) {
		logger.log(Level.WARNING, arg1);

	}

	@Override
	public void log(int arg0, String arg1, Throwable arg2) {
		logger.log(Level.SEVERE, arg1, arg2);

	}
}
