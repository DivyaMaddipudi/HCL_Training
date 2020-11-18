package com.demo;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("i am in servlet s1");
		
//		response.sendRedirect("S2.do");
		RequestDispatcher rd = request.getRequestDispatcher("S2.do");
		rd.forward(request, response);
	
	}

}
