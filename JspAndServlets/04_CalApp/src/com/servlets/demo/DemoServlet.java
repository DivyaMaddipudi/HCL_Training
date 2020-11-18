package com.servlets.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//what can be done with the req: contain the client information
		out.print("client ip: " + request.getRemoteAddr() + "<br>");
		out.print("content type: " + request.getContentType()+ "<br>");
		HttpSession session = request.getSession();
		out.print("is session new ? " + session.isNew()+ "<br>");
		out.print("session id: " + session.getId()+ "<br>");
	}

}
