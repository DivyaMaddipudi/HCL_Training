package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
		String isbn1 = "a1234";
		Query query = session.createQuery("select b from Book b where isbn=:isbn1");
		query.setParameter("isbn1", isbn1);
		Book book = (Book) query.getSingleResult();
		System.out.println(book);
		
//		Book book = new Book("a12356saveorupdate", "think like a monk", "jay", fmt.parse("10/10/2020"), 500);
//		Book book1 = new Book("a1234", "ikigai", "merciga", fmt.parse("11/10/2020"), 200);
//		Book book2 = new Book("a1235", "hibernate", "ks", fmt.parse("10/09/2018"), 300);
		
//		session.saveOrUpdate(book1);
		
		
//		session.save(book1);
//		session.save(book2);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
