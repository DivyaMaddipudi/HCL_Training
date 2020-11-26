package com.bookapp.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		
		BookDao dao = new BookDaoImpl();

		
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
//		Book book1 = new Book("M123", "spring begining", "Baytes", fmt.parse("11/05/2015"), 500);
//		dao.addBook(book1);
		
//		dao.updateBook(3, new Book("M123", "spring begining", "Baytes", fmt.parse("11/05/2015"), 800));
		
//		dao.deleteBook(3);
		
		List<Book> books = dao.getAllBooks();
		books.forEach(b -> System.out.println(b));
		
		
	}

}
