package com.demo.annotation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/S1", "/foo"}, loadOnStartup = 1)
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void init() throws ServletException {
		
		super.init();
		System.out.println("init in S1 is called...........");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("hello by s1");
		
	}

}
