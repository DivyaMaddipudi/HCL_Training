package com.bookstore.controller;

import com.bookstore.DAO.Book;
import com.bookstore.service.BookService;
import com.bookstore.service.BookServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		try {

			Book book = new Book(1, "ikigai", 399);
			BookServiceImpl service = new BookServiceImpl();
			service.addBook(book);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
