package com.customer.dao;

import java.util.List;
import java.util.Optional;

import com.customer.exception.DaoException;
import com.customer.model.Customer;


public interface CustomerDao {

	public List<Customer> getSelectedCustomer(long purchaseCapacity) throws DaoException;
	public List<Customer> getAllCustomers()throws DaoException;
	public void addCustomer(Customer customer) throws DaoException;
	public void deleteCustomer(int custId) throws DaoException;
	public void updateCustomer(int custId, long purchaseCapacity) throws DaoException;
	public Customer getCustomerById(int custId) throws DaoException;
}
