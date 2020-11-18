package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Hello() {
		System.out.println("hello object");
	}
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("this is init method of hello");
		super.init(config);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("this is doget method is called from hello");
	}

	@Override
	public void destroy() {
		System.out.println("this is derstroy method of hello");
		super.destroy();
	}
}
