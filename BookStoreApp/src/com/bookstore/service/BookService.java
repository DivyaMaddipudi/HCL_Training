package com.bookstore.service;

import java.sql.SQLException;

import com.bookstore.DAO.Book;
import com.bookstore.DAO.DataAccessException;

public interface BookService {
	public void addBook(Book book) throws DataAccessException;
}
