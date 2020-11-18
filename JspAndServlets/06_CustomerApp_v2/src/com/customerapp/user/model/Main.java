package com.customerapp.user.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.customerapp.model.CustomerDao;
import com.customerapp.model.CustomerDaoImpl;

public class Main {

	public static void main(String[] args) throws ParseException {
		
//		Connection con = ConnectionFactory.getConnection();
//		if(con !=null) {
//			System.out.println("working");
//		}
		
		
		
		CustomerDao dao = new CustomerDaoImpl();
		
		
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");
//		String dateString = "16/08/2016";
//		LocalDate dateTemp = LocalDate.parse(dateString, fmt);
//		java.sql.Date dob=java.sql.Date.valueOf(dateTemp);
//		System.out.println(dob);
		
//		Customer customer = new Customer("tarun", "delhi", "t@gmail", "12344677", dob, 10);
//		dao.addCustomer(customer);
		
		
//		System.out.println(dao.getCustomerById(3));
//		Customer c = dao.getCustomerById(4);
//		c.setAddress("london");
//		c.setEmail("hello@gmail.com");
//		dao.updateCustomer(4, c);
		
//		List<Customer> customers = dao.getAllCustomers();
//		customers.forEach(cus -> System.out.println(cus));
	
		
//		User
		
		UserDao userDao = new UserDaoImpl();
		User user = userDao.getUser("divya", "divya");
		
	}
}
