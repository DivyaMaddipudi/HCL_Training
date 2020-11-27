package com.bookapp.model.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookapp.exception.DataAccessException;


@Repository
public class BookDaoImpl implements BookDao{

	private SessionFactory factory;
	
	@Autowired
	public BookDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}
	
	//this method is used inside my dao layer....session is open by spring and im just asking for it.
	private Session getSession() {
		return factory.getCurrentSession();
	}


	@Override
	public List<Book> getAllBooks() {
			System.out.println("========================== dao all books=======================");
			return getSession().createQuery("from Book").getResultList();
	}


	@Override
	public void addBook(Book book) {
		
		 getSession().save(book);
	}


	@Override
	public void deleteBook(int id) {
		Book bookToBeDeleted = getBookById(id);
		getSession().delete(bookToBeDeleted);
	}


	@Override
	public void updateBook(int id, Book book) {
		Book bookToBeUpdated = getBookById(id);
		bookToBeUpdated.setPrice(book.getPrice());
		getSession().update(bookToBeUpdated);
		
	}


	@Override
	public Book getBookById(int id) {
		Book book = getSession().get(Book.class, id);
		return book;
	}
}
