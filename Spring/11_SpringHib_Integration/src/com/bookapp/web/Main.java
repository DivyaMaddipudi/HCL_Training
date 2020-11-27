package com.bookapp.web;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		BookService bookService = ctx.getBean("bs", BookService.class);
		
		
//		Book book = new Book("A123", "Rich dad", "rk", new Date(), 300);
//		
//		bookService.addBook(book);
		
		List<Book> books = bookService.getAllBooks();
		
		books.forEach(b->System.out.println(b));
		
	}

}
