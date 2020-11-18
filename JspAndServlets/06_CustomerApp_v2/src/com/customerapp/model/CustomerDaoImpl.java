package com.customerapp.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customerapp.exceptions.DataAccessException;

public class CustomerDaoImpl implements CustomerDao{

	private Connection conn;
	public CustomerDaoImpl() {
		conn = ConnectionFactory.getConnection();
	}
	
	@Override
	public void addCustomer(Customer customer) {
		String add_customer = "insert into customer(name, address, email, phone, dob, purchage_capacity ) values(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(add_customer);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(4, customer.getEmail());
			pstmt.setString(3, customer.getPhone());
			pstmt.setDate(5, new Date(customer.getDob().getTime()));
			pstmt.setInt(6, customer.getPurchaseCapacity());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delCustomer(int id) {
		String add_customer = "delete from customer where id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(add_customer);
			pstmt.setInt(1, id);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new DataAccessException(e.getMessage());
		}
		
	}

	@Override
	public void updateCustomer(int id, Customer customer) {
		Customer customerToUpdate = getCustomerById(id);
		String add_customer = 
		"update customer set address = ?, email =?, phone=?, purchage_capacity=? where id = ?";
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(add_customer);
			pstmt.setString(1, customer.getAddress());
			pstmt.setString(2, customer.getEmail());
			pstmt.setString(3, customer.getPhone());
			pstmt.setInt(4, customer.getPurchaseCapacity());
			pstmt.setInt(5, id);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Customer getCustomerById(int id) {
		
		Customer customer = null;
		PreparedStatement pstmt;
		try {
			
			pstmt = conn.prepareStatement("select * from  customer where id = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				customer = new Customer(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("address"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getDate("dob"),
						rs.getInt("purchage_capacity"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		Customer customer;
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from  customer");
			while(rs.next()) {
				customer = new Customer(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("address"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getDate("dob"),
						rs.getInt("purchage_capacity"));
				customers.add(customer);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return customers;
	}

}
