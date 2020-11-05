package com.performance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.demo.ConnectionFactory;

public class DemoPerfromance {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into mytemp(name) values(?)");
			for(long i=1000;i<1000000;i++) {
				pstmt.setString(1, "foo" + i);
				pstmt.executeUpdate();
			}
			System.out.println("--------done----------");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
