package com.books.model.service;

import java.util.List;

import com.books.model.dao.Book;
import com.books.model.dao.DataAccessException;

public interface BookService {

	public List<Book>getAllBooks();
	public void addBook(Book book);
	public void updateBook(Book book);
	public Book deleteBook(int id);
	
}
