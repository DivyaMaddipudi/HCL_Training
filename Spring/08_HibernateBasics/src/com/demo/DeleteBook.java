package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class DeleteBook {
	
	public static void main(String[] args) {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
		Book book = session.get(Book.class, 2);
		
		if(book != null) {
			book.setPrice(book.getPrice()+100);
			book.setAuthor("mercia");
			session.delete(book);
		}
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
