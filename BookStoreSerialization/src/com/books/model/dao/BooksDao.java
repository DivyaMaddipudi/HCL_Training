package com.books.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public interface BooksDao {
	
	public List<Book> getAllBooks();
	public void addBook(Book book);
	
}
