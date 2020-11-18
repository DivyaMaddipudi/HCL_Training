package com.book.model;

import java.util.List;

public interface BookDao {
	
	public List<Book> getAll();
	public Book add(Book book);
	public Book delete(int bookId);
	public Book update(int id, Book book);
	public Book getById(int bookId);
	

}
