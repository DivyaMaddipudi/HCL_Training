package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Calculator;

public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CalController() {
		System.out.println("obj of cal controller is created");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		Integer sum = null;
		try {
			int firstNum = Integer.parseInt(request.getParameter("value1"));
			int secondNum = Integer.parseInt(request.getParameter("value2"));
			sum = Calculator.sum(firstNum, secondNum);
		} catch (NumberFormatException e) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("cal.jsp");
			request.setAttribute("error", "validation error");
			dispatcher.forward(request, response);
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		request.setAttribute("result", sum);
		dispatcher.forward(request, response);
		
	}
}
