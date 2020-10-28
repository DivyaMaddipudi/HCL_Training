package com.books.model.service;

import java.util.List;

import com.books.model.dao.Book;
import com.books.model.dao.BookDAOImpl;
import com.books.model.dao.BookDao;

public class BookServiceImpl implements BookService{

	private BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao = new BookDAOImpl();
	}
	@Override
	public List<Book> getAllBooks() {
		//extra stuff:
		return bookDao.getAllBooks();
	}
	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
	}
	@Override
	public Book deleteBook(int id) {
		return bookDao.deleteBook(id);
	}
	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);
		
	}

}
