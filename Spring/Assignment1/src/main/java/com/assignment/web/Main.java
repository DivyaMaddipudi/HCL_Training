package com.assignment.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assignment.config.AppConfig;
import com.assignment.dao.Book;
import com.assignment.service.BookService;
import com.assignment.service.BookServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanMap.xml");
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanAnnotation.xml");
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		BookService bookService = ctx.getBean("bookService", BookServiceImpl.class);
		System.out.println(bookService.getAllBooks());
		
		bookService.addBook(new Book("A123", "Spring in action", "baytes", 600));
		System.out.println("---------------after adding------------------");
		System.out.println(bookService.getAllBooks());
		
		bookService.deleteBook(1);
		System.out.println("---------------after deleting------------------");
		System.out.println(bookService.getAllBooks());
		
		Book book = new Book("A1234", "begining Spring", "rohndson", 800);
		bookService.updateBook(3, book);
		System.out.println("---------------after updating------------------");
		System.out.println(bookService.getAllBooks());
		
		System.out.println("--------------get book by id----------------------");
		System.out.println(bookService.getBookById(3));
	}

}
