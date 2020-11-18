package com.book.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BookTester {
	
	public static void main(String[] args) {
		BookDao dao = new BookDaoImpl();
		
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");
//		String dateString = "16/08/2016";
//		LocalDate dateTemp = LocalDate.parse(dateString, fmt);
//		java.sql.Date dob=java.sql.Date.valueOf(dateTemp);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");
		String dateString = "01/06/2010";
		LocalDate dateTemp = LocalDate.parse(dateString, fmt);
		Date dob = Date.valueOf(dateTemp);
		Book b1 = new Book("D123", "Head first servlets/jsp", "kethy seira", dob, 700);
		dao.add(b1);
		
		List<Book> books = dao.getAll();
		books.forEach(book -> System.out.println(book));
		
	}

}
