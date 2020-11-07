package com.customer.controller;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.customer.dao.CustomerDaoImpl;
import com.customer.exception.DaoException;
import com.customer.model.Customer;

public class MainController {

	public static void main(String[] args) throws ParseException {

		CustomerDaoImpl customerDao = new CustomerDaoImpl();
		
		try {
			System.out.println("----------------------------------get all customers based on purchase capacity--------------------------------------");
			List<Customer> customersBasedOnPurchaseCapacity = customerDao.getSelectedCustomer(5);
			customersBasedOnPurchaseCapacity.forEach(System.out::println);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			System.out.println("----------------------------------get all customers--------------------------------------");
			List<Customer> custList = customerDao.getAllCustomers();

			for (Customer customer : custList) {
				System.out.println(customer);
			}
		} catch (DaoException e1) {
			e1.printStackTrace();
		}
		
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");
		String dateString = "16/08/2016";
		LocalDate dateTemp = LocalDate.parse(dateString, fmt);
		System.out.println(dateTemp);

		java.sql.Date dateSql=java.sql.Date.valueOf(dateTemp);
		
		Customer addCustomer = new Customer("rams", "9976543201", "rs@gmail.com", dateSql, "mumbai", 25);
		
		try {
			customerDao.addCustomer(addCustomer);
		} catch (DaoException e) {
			e.printStackTrace();
		}
		
		
//		try {
//			System.out.println("--------------------------update purchase capacity customer by id-------------------------------------------");
//			customerDao.updateCustomer(5, 15);
//		} catch (DaoException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
//		try {
//			System.out.println("--------------------------delete customer by id-------------------------------------------");
//			customerDao.deleteCustomer(20);
//		} catch (DaoException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
//		try {
//			System.out.println("--------------------------get customer by id-------------------------------------------");
//			Customer customer = customerDao.getCustomerById(3);
//			System.out.println(customer);
//			
//		} catch (DaoException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
