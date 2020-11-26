package com.demo.inheritance.singhe_table;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bookapp.dao.HibernateSessionFactory;

public class Main {
	
	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		
		
		List<Account> accounts = session.createQuery("from Account").getResultList();
		
		accounts.forEach(a->System.out.println(a));
		
//		SavingAccount account = new SavingAccount("divya", 5000, 4.5);
//		CurrentAccount account2 = new CurrentAccount("veenai", 6000, 1000);
//		
//		session.save(account);
//		session.save(account2);
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		 
	}

}
