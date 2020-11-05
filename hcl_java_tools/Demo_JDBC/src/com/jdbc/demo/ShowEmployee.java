package com.jdbc.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ShowEmployee {

	public static void main(String[] args) {

		Statement stmt = null;
		ResultSet rs = null;

		Connection connection = ConnectionFactory.getConnection();
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from employee");
			

//			while (rs.next()) {
//				System.out.println(rs.getInt("eid") + " " + rs.getString("ename") + " " + rs.getInt("salary") + " "
//						+ rs.getInt("did_fk"));
//			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}
}
