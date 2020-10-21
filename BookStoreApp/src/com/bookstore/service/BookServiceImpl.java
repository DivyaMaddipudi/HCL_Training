package com.bookstore.service;

import java.sql.SQLException;

import com.bookstore.DAO.Book;
import com.bookstore.DAO.BookDao;
import com.bookstore.DAO.BookDaoImplHibernate;
import com.bookstore.DAO.DataAccessException;

public class BookServiceImpl implements BookService{
	
	private BookDao bookDao;
	public BookServiceImpl() {
		bookDao = new BookDaoImplHibernate();
	}
	
	@Override
	public void addBook(Book book) throws DataAccessException {
		//code for security logging transaction mgmt etc..,
		bookDao.addBook(book);
	}
}
