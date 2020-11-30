package com.customerapp.model.service;

import java.util.List;

import com.customerapp.model.dao.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public void addCustomer(Customer customer);
	public void updateCustomer(int id, Customer customer);
	public void deleteCustomer(int id);
	public Customer getCustomerById(int id);
	public Customer getCustomerByNameAndPhone(String name, String phone);

}
