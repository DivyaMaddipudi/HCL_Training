package com.lifecycle.hib;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;

import com.bookapp.dao.HibernateSessionFactory;

public class MainTester {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		
		
//		StatelessSession session = factory.openStatelessSession();
//		session.getTransaction().begin();
//		List<Customer> customers = session.createQuery("from Customer").list();
//		
//		customers.forEach(c -> System.out.println(c));
//		
//		session.close();
		
		//flush
		//let say u haveloaded a customer and wan to update it
		//but commit is thare
		
		
		
		
		
		
		
		//hibernate before actually hitting the db...it first look the objects (entities)
		// in the first level cached (persistance context)
		//if the object is found it dont hit db
		
		//what happen if i call special method to clean first level cache
//		Customer customer = session.get(Customer.class, 1);
//		Customer customer2 = session.get(Customer.class, 2);
//		session.clear();
//		Customer customer1 = session.get(Customer.class, 1);
//		System.out.println(session);
		
		
		
//		session.getTransaction().begin();
//		Customer customer = session.get(Customer.class, 1);
//		
//		customer.setAddress("chennai");
//		customer.setAddress("noida");
//		customer.setAddress("rjy");
//		
//		session.getTransaction().commit();
//		session.close();
//		factory.close();
		
		
		
		
		
//		Customer customer1 = new Customer("RAJ", "delhi");
//		Customer customer2 = new Customer("divya", "andhra");
//		Customer customer3 = new Customer("riya", "chennai");
//		
//		Transaction tx = session.getTransaction();
//		
//		try {
//			tx.begin();
//			session.save(customer1);
//			session.save(customer2);
//			session.save(customer3);
//			
//		} catch (HibernateException e) {
//			
//			tx.commit();
//		}
//		
//		session.close();
//		factory.close();
		
	}

}
