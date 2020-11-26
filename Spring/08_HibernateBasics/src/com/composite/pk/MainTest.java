package com.composite.pk;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bookapp.dao.HibernateSessionFactory;
import com.demo.Book;

public class MainTest {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		Session session = factory.openSession();
		
		
//		BookId id = new BookId("666", "python");
//		Book book = new Book(id, "raj", new Date(), 700);
		Book book = new Book("a123546", "think like a monk", "jay", new Date(), 500);
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(book);
			tx.commit();
		}catch (HibernateException e) {
			// TODO: handle exception
		}
		
	}

}
