package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		
		Book book = new Book("a12356saveorupdate", "think like a monk", "jay", fmt.parse("10/10/2020"), 500);
//		Book book1 = new Book("a1234", "ikigai", "merciga", fmt.parse("11/10/2020"), 200);
//		Book book2 = new Book("a1235", "hibernate", "ks", fmt.parse("10/09/2018"), 300);
		
		session.saveOrUpdate(book);
		
		
//		session.save(book1);
//		session.save(book2);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
