package com.jdbc.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class AddEmployee {

	public static void main(String[] args) {

		Statement stmt = null;
		ResultSet rs = null;

		
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement pstmt = connection.prepareStatement("insert into employee(ename, salary, did_fk) values (?, ?, ?)");
			pstmt.setString(1, "ali");
			pstmt.setInt(2, 3000);
			pstmt.setInt(3, 4);
			
			int numOfRecords = pstmt.executeUpdate();
			System.out.println(numOfRecords);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}
}
