package com.bookapp.dao;

import java.text.SimpleDateFormat;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bookapp.exception.DataAccessException;



public class BookDaoImpl implements BookDao{

	private SessionFactory factory;
	
	
	public BookDaoImpl() {
		factory = HibernateSessionFactory.getSessionFactory();
	}


	@Override
	public List<Book> getAllBooks() {
		
			Session session = factory.openSession();
			List<Book> books = session.createQuery("from Book").getResultList();
			session.close();
			return books;
	}


	@Override
	public Book addBook(Book book) {
		Session session = factory.openSession();
		
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(book);
			session.getTransaction().commit();
			session.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return book;
	}


	@Override
	public void deleteBook(int id) {
		Book bookToBeDeleted = getBookById(id);
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		if(bookToBeDeleted != null) {
			tx.begin();
			session.delete(bookToBeDeleted);
			
		} else {
			throw new DataAccessException("book not found");
		}
		
		session.getTransaction().commit();
		session.close();
		
		
	}


	@Override
	public void updateBook(int id, Book book) {
		Book bookToBeUpdated = getBookById(id);
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		
		if(bookToBeUpdated != null) {
			tx.begin();
			bookToBeUpdated.setPrice(book.getPrice());
			session.update(bookToBeUpdated);
			
		} else {
			throw new DataAccessException("book not found");
		}
		
		session.getTransaction().commit();
		session.close();
		
	}


	@Override
	public Book getBookById(int id) {
		Session session = factory.openSession();
		session.getTransaction().begin();
		Book book = session.get(Book.class, id);
		session.getTransaction().commit();
		session.close();
		return book;
	}
}
