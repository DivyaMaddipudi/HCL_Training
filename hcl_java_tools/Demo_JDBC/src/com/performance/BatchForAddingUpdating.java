package com.performance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.demo.ConnectionFactory;


public class BatchForAddingUpdating {

	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		
		PreparedStatement pstmt;
		try {
			
			pstmt = conn.prepareStatement("insert into mytemp(name) values(?)");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
