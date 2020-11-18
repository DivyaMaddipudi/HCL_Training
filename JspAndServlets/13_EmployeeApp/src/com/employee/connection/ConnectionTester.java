package com.employee.connection;

import java.sql.Connection;

public class ConnectionTester {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		if(conn != null) {
			System.out.println("working");
		}
	}

}
