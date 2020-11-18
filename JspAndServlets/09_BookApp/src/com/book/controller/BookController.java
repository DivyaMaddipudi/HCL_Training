package com.book.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.model.Book;
import com.book.model.BookDao;
import com.book.model.BookDaoImpl;


public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookDao dao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		if(action.equals("showBooks")) {
			dao = new BookDaoImpl();
			List<Book> books = dao.getAll();
			request.setAttribute("books", books);
			RequestDispatcher dispatcher = request.getRequestDispatcher("showBooks.jsp");
			dispatcher.forward(request, response);
		} else if(action.equals("addbook")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("add_book.jsp");
			dispatcher.forward(request, response);
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String isbn = request.getParameter("isbn");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String dateString = request.getParameter("date");
		String price = request.getParameter("price");
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate dateTemp = LocalDate.parse(dateString, fmt);
		Date pubDate = Date.valueOf(dateTemp);
		Book addBook = new Book("D124", "Spring in action notes", "Rajeev", pubDate, 200);
		
		dao.add(addBook);
		response.sendRedirect("bookController?action=showBooks");
	}
}
