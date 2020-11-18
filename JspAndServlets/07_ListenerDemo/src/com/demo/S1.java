package com.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Dog dog = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dog = (Dog) this.getServletContext().getAttribute("dog");
		System.out.println(request.getRequestURI());
		System.out.println(dog.hashCode());
		System.out.println(dog.getDogName());
	}

}
