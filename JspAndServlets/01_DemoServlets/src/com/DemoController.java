package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoController
 */
public class DemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		System.out.println("demo controller init");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("demo controller doGet");
	}
	
  	@Override
	public void destroy() {
  		System.out.println("demo controller destroy");
		
	}

}
