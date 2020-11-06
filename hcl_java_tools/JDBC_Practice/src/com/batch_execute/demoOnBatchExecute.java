package com.batch_execute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demoOnBatchExecute {

	public static void main(String[] args) {

		Connection conn = ConnectionFactory.getConnection();

		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into batchtemp (name) values (?)");
			for (int i = 0; i < 100000; i++) {
				pstmt.setString(1, "foo" + i);
				pstmt.executeUpdate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
