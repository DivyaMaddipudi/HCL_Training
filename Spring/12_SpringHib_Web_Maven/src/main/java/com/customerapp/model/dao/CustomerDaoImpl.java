package com.customerapp.model.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	private SessionFactory factory;
	
	@Autowired
	public CustomerDaoImpl(SessionFactory factory) {
		this.factory = factory;
	}

	private Session getSession() {
		return factory.getCurrentSession();
	}
	@Override
	public List<Customer> getAllCustomers() {
		return getSession().createQuery("from Customer").list();
	}

	@Override
	public void addCustomer(Customer customer) {
		getSession().save(customer);
		
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		Customer customerToBeUpdated = getCustomerById(id);
		customerToBeUpdated.setPhoneNum(customer.getPhoneNum());
		customerToBeUpdated.setAddress(customer.getAddress());
		getSession().update(customerToBeUpdated);
		
	}

	@Override
	public void deleteCustomer(int id) {
		Customer customerToBeDeleted = getCustomerById(id);
		getSession().delete(customerToBeDeleted);
		
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer = getSession().get(Customer.class, id);
		return customer;
	}

	@Override
	public Customer getCustomerByNameAndPhone(String name, String phone) {
		
		Query query = getSession().createQuery("select c from Customer c where customerName=:name and phoneNum=:phone");
		query.setParameter("name", name);
		query.setParameter("phone", phone);
		Customer customer = (Customer) query.getResultList();
		return customer;
	}
	
	

}
