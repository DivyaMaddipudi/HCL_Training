package com.performance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.demo.ConnectionFactory;

public class ReadBack {

	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from mytemp");
			//pstmt.setFetchSize(100);
			System.out.println(pstmt.getFetchSize());
		
			long start = System.currentTimeMillis();
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
			long end = System.currentTimeMillis();
			
			System.out.println("time taken: " + (end- start));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
