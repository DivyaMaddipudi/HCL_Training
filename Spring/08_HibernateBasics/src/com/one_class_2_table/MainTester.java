package com.one_class_2_table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.HibernateSessionFactory;

public class MainTester {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		Session session = factory.openSession();
		session.getTransaction().begin();
		Customer customer = new Customer("satya", "hyd", "123567222", "s@s.com");
		session.save(customer);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
	}

}
