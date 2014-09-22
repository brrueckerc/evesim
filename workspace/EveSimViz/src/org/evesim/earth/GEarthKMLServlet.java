package org.evesim.earth;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class GEarthKMLServlet extends HttpServlet {
	
	private static final boolean useLib = false;
	private static final String GEARTH_CONTENT_TYPE = "application/vnd.google-earth.kml+xml"; 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UUID sessionId = UUID.fromString(request.getParameter("sid"));
		//System.out.println("sessionId: "+sessionId);
		
		GEarthSession session = GEarthViewController.getInstance().getSession(sessionId);
		
		if (session == null) {
			throw new ServletException("Invalid Session: "+sessionId);
		}
		
		//response.setContentType("text/xml");

		response.setContentType(GEARTH_CONTENT_TYPE);
		PrintWriter writer = response.getWriter();
		session.getKml(writer);
		writer.flush();
		writer.close();
    }
}
