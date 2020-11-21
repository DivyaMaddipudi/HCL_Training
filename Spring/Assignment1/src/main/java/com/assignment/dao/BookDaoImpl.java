package com.assignment.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

//@Component(value = "bookDao")
public class BookDaoImpl implements BookDao{
	private int counter;
	private Map<Integer, Book> booksMap;
	
	
	
//	static  {
//		booksMap.put(++counter, new Book(counter, "ABC123", "Head first Java" , "Katthy", 600));
//		booksMap.put(++counter,  new Book(counter, "ABC723", "Servlet jsp Java" , "Katthy", 700));
//	}
	
	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void setBooksMap(Map<Integer, Book> booksMap) {
		this.booksMap = booksMap;
	}
	
	public int getCounter() {
		return getBooksMap().size();
	}

	public Map<Integer, Book> getBooksMap() {
		return booksMap;
	}

	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<Book>(getBooksMap().values());
	}

	@Override
	public Book addBook(Book book) {
		counter = getCounter() + 1;
		System.out.println(counter);
		book.setId(counter);
		getBooksMap().put(counter, book);
		return getBooksMap().get(counter);
	}

	@Override
	public void deleteBook(int id) {
		booksMap.remove(id);
		
	}

	@Override
	public void updateBook(int id, Book book) {
		book.setId(id);
		booksMap.put(counter, book);
		booksMap.put(id, book);
		
	}

	@Override
	public Book getBookById(int id) {
		return booksMap.get(id);
	}

}
