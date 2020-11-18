package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DemoSession extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//will create a jsession id and send that to browser so that browser can store in its cookies
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		
		out.println("is new session " + session.isNew());
		out.println("session id " + session.getId());
		out.println("session creation time " + session.getCreationTime());
		out.println("last access time " + session.getLastAccessedTime());
		out.println("max inactive interval " + session.getMaxInactiveInterval());
		out.println("hash code " + session.hashCode());
		
	}

}
