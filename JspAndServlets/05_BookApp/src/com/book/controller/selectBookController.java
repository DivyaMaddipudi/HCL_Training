package com.book.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.model.BookAdvisor;

/**
 * Servlet implementation class selectBookController
 */
public class selectBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String topic = request.getParameter("topic");
		List<String> booksName = BookAdvisor.getBooks(topic);
		request.setAttribute("bookNames", booksName);
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

}
