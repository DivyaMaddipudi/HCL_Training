package com.jdbc.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class UpdateEmployee {

	public static void main(String[] args) {

		Statement stmt = null;
		ResultSet rs = null;


		try {

			Connection connection = ConnectionFactory.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement("update employee set salary =? where eid = ? ");
			
			pstmt.setInt(1, 5000);
			pstmt.setInt(2, 6);
			
			int numOfrec = pstmt.executeUpdate();
			System.out.println(numOfrec);
			
			
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}
}
