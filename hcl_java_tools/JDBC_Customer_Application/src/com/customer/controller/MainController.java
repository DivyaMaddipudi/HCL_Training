package com.customer.controller;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.customer.exception.DaoException;
import com.customer.model.Customer;
import com.customer.service.CustomerServiceImpl;

public class MainController {

	public static void main(String[] args) throws ParseException {

		CustomerServiceImpl customerService = new CustomerServiceImpl();
		
		try {
			System.out.println("----------------------------------get all customers based on purchase capacity--------------------------------------");
			List<Customer> customersBasedOnPurchaseCapacity = customerService.getSelectedCustomer(15);
			customersBasedOnPurchaseCapacity.forEach(System.out::println);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		try {
//			System.out.println("----------------------------------get all customers--------------------------------------");
//			List<Customer> custList = customerService.getAllCustomers();
//
//			for (Customer customer : custList) {
//				System.out.println(customer);
//			}
//		} catch (DaoException e1) {
//			e1.printStackTrace();
//		}
		
		
		
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");
//		String dateString = "16/08/2016";
//		LocalDate dateTemp = LocalDate.parse(dateString, fmt);
//		System.out.println(dateTemp);
//
//		java.sql.Date dateSql=java.sql.Date.valueOf(dateTemp);
//		
//		Customer addCustomer = new Customer("rams", "9976543201", "rs@gmail.com", dateSql, "mumbai", 25);
//		
//		try {
//			customerService.addCustomer(addCustomer);
//		} catch (DaoException e) {
//			e.printStackTrace();
//		}
		
		
//		try {
//			System.out.println("--------------------------update purchase capacity customer by id-------------------------------------------");
//			customerService.updateCustomer(10, 15);
//		} catch (DaoException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
//		try {
//			System.out.println("--------------------------delete customer by id-------------------------------------------");
//			customerService.deleteCustomer(20);
//		} catch (DaoException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
		try {
			System.out.println("--------------------------get customer by id-------------------------------------------");
			Customer customer = customerService.getCustomerById(5);
			System.out.println(customer);
			
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
