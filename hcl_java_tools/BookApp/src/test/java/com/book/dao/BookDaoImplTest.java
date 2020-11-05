package com.book.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class BookDaoImplTest {

	BookDaoImpl dao;
	Book book;
	public BookDaoImplTest() {
		dao = new BookDaoImpl();
	}
	
	@Test
	public void testBookDaoImpl() {
		
	}

	@Test
	public void testGetAllBooks() {
		int noOfRec = dao.listBooks.size();
		assertEquals(4, noOfRec);
	}

//	@Ignore
	@Test
	public void testAddBook() {
		Book book = new Book(10, "Think like a monk", "3456");
		dao.addBook(book);
		int noOfRec = dao.listBooks.size();
		assertEquals(5, noOfRec);
	}
	
	@Test
	public void testAddBookFalse() {
		Book book = new Book(10, "Think like a monk", "3456");
		int noOfRec = dao.listBooks.size();
		assertNotEquals(dao.listBooks.get(noOfRec-1), dao.listBooks.add(book));
	}

	@Test
	public void testUpdateBook() {
		
		book= dao.listBooks.get(0);
//		System.out.println(book);
		assertEquals(book, dao.updateBook("ikigai", "123456"));
		
		
	}

	@Test
	public void testDelBook() {
		
		
		dao.delBook("123456");
		int noOfRec = dao.listBooks.size();
//		System.out.println(noOfRec);
		assertEquals(3, noOfRec);
		
	}
	
	@Test(expected = BookNotFoundException.class)
	public void testDelBookFalse() {
		dao.delBook("12356");
		int noOfRec = dao.listBooks.size();
		System.out.println(noOfRec);
		assertNotEquals(3, noOfRec);
	}
}
