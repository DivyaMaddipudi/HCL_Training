package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		Integer counter = (Integer) session.getAttribute("counter");
	
		if(counter == null) {
			//he is a first time user
			
			out.print("welcome firrst time user, plz visit frequently");
			session.setAttribute("counter", 1);
		} else {
			out.print("hi user u have visited " + counter + "pleaaase keep visiting");
			counter++;
			session.setAttribute("counter", counter);
		}
	}

}
