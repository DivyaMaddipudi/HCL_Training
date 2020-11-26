package com.many_to_many.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.HibernateSessionFactory;

public class MainTester {
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session sesssion = factory.openSession();
		
		
		
	}
}
