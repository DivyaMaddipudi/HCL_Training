package com.customerapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customerapp.model.dao.Customer;
import com.customerapp.model.dao.CustomerDao;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao custDao;
	
	@Autowired
	public CustomerServiceImpl(CustomerDao custDao) {
		super();
		this.custDao = custDao;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return custDao.getAllCustomers();
	}

	@Override
	public void addCustomer(Customer customer) {
		custDao.addCustomer(customer);
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		custDao.updateCustomer(id, customer);
	}

	@Override
	public void deleteCustomer(int id) {
		custDao.deleteCustomer(id);
		
	}

	@Override
	public Customer getCustomerById(int id) {
		return custDao.getCustomerById(id);
	}

	@Override
	public Customer getCustomerByNameAndPhone(String name, String phone) {
		return custDao.getCustomerByNameAndPhone(name, phone);
	}

}
