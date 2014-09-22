package org.evesim.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EveMonitorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		hanldeRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		hanldeRequest(req, resp);
	}

	protected void hanldeRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setStatus(200);
		resp.setContentType("text/text");
		PrintWriter w = new PrintWriter(resp.getWriter());
		returnResult(w);
		w.flush();
		w.close();
	}
	
	private void returnResult(PrintWriter w) {
		w.println("OK");
		
	}
	
}
