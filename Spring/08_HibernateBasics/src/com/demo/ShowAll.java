package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.bookapp.dao.Book;

public class ShowAll {
	
	public static void main(String[] args) {
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory factory = new MetadataSources(serviceRegistry ).buildMetadata().buildSessionFactory();
		
		Session session = factory.openSession();
//		List<BookData> books = session.createQuery("select new com.demo.BookData(b.title, b.price) from Book b").getResultList();
//		books.forEach(b -> System.out.println(b));
		
		List<Book> books = session.createQuery("from Book").getResultList();
		books.forEach(b -> System.out.println(b));
		
		session.close();
		factory.close();
		
	}

}
