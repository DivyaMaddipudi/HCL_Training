package com.batch_execute;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadBack {

	public static void main(String[] args) {

		Connection conn = ConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from batchtemp");
//			pstmt.setFetchSize(1000);
//			System.out.println(pstmt.getFetchSize());
			ResultSet rs = pstmt.executeQuery();

			long start = System.currentTimeMillis();
			
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}

			long end = System.currentTimeMillis();

			System.out.println("time taken: " + (end - start));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
