package com.customerapp.model;

import java.util.List;

public interface CustomerDao {
	
	public void addCustomer(Customer customer);
	public void delCustomer(int id);
	public void updateCustomer(int id, Customer customer);
	public Customer getCustomerById(int id);
	public List<Customer> getAllCustomers();
	

}
