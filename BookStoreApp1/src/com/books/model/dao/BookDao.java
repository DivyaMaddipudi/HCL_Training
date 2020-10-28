package com.books.model.dao;
import java.util.*;

public interface BookDao {
	//CRUD
	public List<Book>getAllBooks() throws DataAccessException;
	public void addBook(Book book) throws DataAccessException;
	public void updateBook(Book book) throws DataAccessException;
	public Book deleteBook(int id) throws DataAccessException;
	
	
	//more operation
}
