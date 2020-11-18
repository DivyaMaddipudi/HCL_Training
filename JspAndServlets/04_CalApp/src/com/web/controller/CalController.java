package com.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.model.Calculator;

public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/WEB-INF/views/cal.jsp").forward(request, response);
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int sum = Calculator.add(num1, num2); 
		
//		PrintWriter out = response.getWriter();
//		out.print(sum + "<br>");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("sum", sum);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
//		dispatcher.forward(request, response);
		
		response.sendRedirect("temp");
//		request.getRequestDispatcher("temp").forward(request, response);
	}
}
