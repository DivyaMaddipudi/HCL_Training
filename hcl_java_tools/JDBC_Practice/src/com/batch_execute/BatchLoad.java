package com.batch_execute;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchLoad {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into batchtemp(name) values (?)");
			for(int i=0;i<10000000;i++) {
				
				pstmt.setString(1, "foo" + i);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
