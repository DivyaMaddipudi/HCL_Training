package com.customerapp.model.dao;

import java.util.List;

public interface CustomerDao {
	
	public List<Customer> getAllCustomers();
	public void addCustomer(Customer customer);
	public void updateCustomer(int id, Customer customer);
	public void deleteCustomer(int id);
	public Customer getCustomerById(int id);
	public Customer getCustomerByNameAndPhone(String name, String phone);
	
}
