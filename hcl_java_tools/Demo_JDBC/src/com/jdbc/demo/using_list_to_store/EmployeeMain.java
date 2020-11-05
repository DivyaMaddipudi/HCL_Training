package com.jdbc.demo.using_list_to_store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		ResultSet rs = null;
		Statement st = null;
		Employee emp = null;
		
		String url = "jdbc:mysql://localhost:3306/hcl_batch6";
		String uname = "student";
		String pass = "student";
		
		//Load driver 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create connection 
		try(Connection conn = DriverManager.getConnection(url, uname, pass)) {
			 st = conn.createStatement();
			 rs = st.executeQuery("select * from employee");
			
			
			
			while(rs.next()) {
				emp = new Employee();
				emp.setEid(rs.getInt("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDid_fk(rs.getInt("did_fk"));
				employeeList.add(emp);	
			}
			
			for(Employee employee : employeeList) {
				System.out.print(employee.getEid() + " ");
				System.out.print(employee.getEname() + " ");
				System.out.print(employee.getSalary() + " ");
				System.out.print(employee.getDid_fk() + " ");
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
