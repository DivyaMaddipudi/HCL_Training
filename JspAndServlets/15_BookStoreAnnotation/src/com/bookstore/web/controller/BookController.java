package com.bookstore.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.model.book.dao.Book;
import com.bookstore.model.book.dao.BookDao;
import com.bookstore.model.book.dao.BookDaoImpl;


@WebServlet("/BookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		if(action.equals("showBooks")) {
			BookDao dao = new BookDaoImpl();
			List<Book> books = dao.getAll();
			for(Book book : books) {
				System.out.println(book);
			}
			request.setAttribute("books", books);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
	}

}
