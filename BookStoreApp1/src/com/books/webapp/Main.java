package com.books.webapp;

import java.util.List;

import com.books.model.dao.Book;
import com.books.model.service.BookService;
import com.books.model.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		
//		System.out.println("-------------books available---------------");
//		List<Book> books = bookService.getAllBooks();
//		for (Book book : books) {
//			System.out.println(book);
//		}
//		
//		Book newBook = new Book(1001, "c", 121, 10, "yaswanth kanethkar", "IT");
//		bookService.addBook(newBook);
		
//		System.out.println("---------------after adding----------------");
		
//		List<Book> books1 = bookService.getAllBooks();
//		for (Book book : books1) {
//			System.out.println(book);
//		}
		
		System.out.println(bookService.deleteBook(123) + " was deleted successfully");
		
//		Book book = new Book(123, "python", 120.0, 0.2, "Rossum", "IT");
//		bookService.updateBook(book);
//		
//		System.out.println("---------------after modified----------------");
//		
//		List<Book> books1 = bookService.getAllBooks();
//		
//		for (Book bookTemp : books1) {
//			System.out.println(bookTemp);
//		}
		
	}
}
