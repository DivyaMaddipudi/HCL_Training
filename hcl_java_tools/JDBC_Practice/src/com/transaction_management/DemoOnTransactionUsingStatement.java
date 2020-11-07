package com.transaction_management;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.batch_execute.ConnectionFactory;

public class DemoOnTransactionUsingStatement {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		
		
		
		Statement stmt;
		try {
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			stmt.executeUpdate("update transaction_ex set balance = balance - 10 where id = 1");
			stmt.executeUpdate("update transaction_ex set balance = balance + 10 where id = 2");
			System.out.println("details added successfully");
			
			conn.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
