package com.demo.queries;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.bookapp.dao.HibernateSessionFactory;

public class DemoQueries {

	public static void main(String[] args) {
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();

		/*
		 * Criteria criteria = session.createCriteria(Customer.class);
		 * criteria.add(Restrictions.eqProperty("name", "divya")); List<Customer>
		 * customers = session.createNamedQuery("findCustomerById").getResultList();
		 * customers.forEach(c -> System.out.println(c));
		 */

		/*
		 * Customer customer = new Customer("divya", "andhra"); Customer customer1 = new
		 * Customer("veenai", "chennai"); Customer customer2 = new Customer("riya",
		 * "banglore"); Customer customer3 = new Customer("ram", "andhra"); Customer
		 * customer4 = new Customer("jaggu", "mumbai");
		 * 
		 * session.save(customer); session.save(customer1); session.save(customer2);
		 * session.save(customer3); session.save(customer4);
		 */

		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
