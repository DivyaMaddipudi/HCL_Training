package com.more.annotations;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bookapp.dao.HibernateSessionFactory;
import com.demo.Book;

public class MainTester {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		Session session = factory.openSession();
		
//		Book book = new Book("a12354", "think like a monk", "jay", new Date(), 500);
		Book book = new Book("a123546", "think like a monk1", "jay1", new Date(), 500);
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.update(book);
			tx.commit();
		}catch (HibernateException e) {
			tx.rollback();
		}
	}

}
