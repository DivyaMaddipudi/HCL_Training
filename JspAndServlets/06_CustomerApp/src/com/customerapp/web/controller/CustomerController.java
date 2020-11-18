package com.customerapp.web.controller;

import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customerapp.model.Customer;
import com.customerapp.model.CustomerDao;
import com.customerapp.model.CustomerDaoImpl;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection con = null;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		con = (Connection) config.getServletContext().getAttribute("con");
	}

	private CustomerDao dao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action.equals("showall")) {
		dao = new CustomerDaoImpl();
		List<Customer> customers = dao.getAllCustomers();
		request.setAttribute("customers", customers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/getAllCustomers.jsp");
		dispatcher.forward(request, response);
		} else if(action.equals("addcustomer")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/add.jsp");
			rd.forward(request, response);
		} else if(action.equals("deletecustomer")) {
			int id = Integer.parseInt(request.getParameter("id").trim());
			dao.delCustomer(id);
			response.sendRedirect("customercontroller.do?action=showall");
			
		} else if(action.equals("updatecustomer")) {
			int id = Integer.parseInt(request.getParameter("id").trim());
			
			Customer customer = dao.getCustomerById(id);
			//put the customer obj in the req scope
			request.setAttribute("customer", customer);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/update.jsp");
			rd.forward(request, response);
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id").trim());
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		String purchage_capacityString= request.getParameter("purchage_capacity");
		int purchaseCapacity = Integer.parseInt(purchage_capacityString);
		Customer customer;

		if(id > 0) {
			customer = new Customer(address, email, phone, purchaseCapacity);
			dao.updateCustomer(id, customer);
			response.sendRedirect("customercontroller.do?action=showall");
		} else {
			String name = request.getParameter("name");
			String dobString = request.getParameter("dob");
			
			
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d/MM/yyyy");
			LocalDate dateTemp = LocalDate.parse(dobString, fmt);
			java.sql.Date dob=java.sql.Date.valueOf(dateTemp);

			
			customer = new Customer(name, address, email, phone, dob, purchaseCapacity);
			dao.addCustomer(customer);
			//dont forget prg
			response.sendRedirect("customercontroller.do?action=showall");
		}
	}
}
