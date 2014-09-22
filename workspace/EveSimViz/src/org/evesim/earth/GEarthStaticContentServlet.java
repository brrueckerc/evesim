package org.evesim.earth;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Copied from @author reder
 * 
 * @author swatinem
 * 
 */
class GEarthStaticContentServlet extends HttpServlet {
	public final static String WEB_RESOURCE_ROOT = "/web";
	public final static String SERVLET_CONTEXT = "/default";
	private boolean initialized = false;

	final static Logger logger = Logger.getLogger(GEarthStaticContentServlet.class.getName());
	
	public ClassLoader getClassloader() {
		return Thread.currentThread().getContextClassLoader();
	}

	public void init(ServletConfig config) throws ServletException {

		try {
			super.init(config);
			Enumeration<URL> t = getClassloader().getResources(WEB_RESOURCE_ROOT + "/webroot.txt");
			if (!t.hasMoreElements()) {
				logger.log(Level.SEVERE, "Web resources not available. Visualisations may not work. "
						+ "Please check if 'webroot.txt' is existing in the specified directory.");
			}
		} catch (IOException ex) {
			logger.log(Level.SEVERE, "Web resources not available. Visualisations may not work.", ex);
		}

		initialized = true;
	}

	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (!initialized) {
			handleError(request, response, "Web resource not initialized. See error log for details.");
			return;
		}

		String sessionId = request.getParameter("sid");
		System.out.println("sessionId: " + sessionId);

		int idx = request.getRequestURL().indexOf(SERVLET_CONTEXT);
		idx = idx + SERVLET_CONTEXT.length();

		String filename = WEB_RESOURCE_ROOT + request.getRequestURL().substring(idx);
		logger.log(Level.INFO, "Loading: " + filename);
		
		InputStream in = getClassloader().getResourceAsStream(filename);
		if (in == null)
			throw new IOException("Resource " + filename + " not found.");

		OutputStream out = response.getOutputStream();

		response.setStatus(HttpServletResponse.SC_OK);
		byte[] b = new byte[512];
		int cnt = 0;
		while (in.available() != 0) {
			cnt = in.read(b);
			out.write(b, 0, cnt);
		}
		out.flush();
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
}
