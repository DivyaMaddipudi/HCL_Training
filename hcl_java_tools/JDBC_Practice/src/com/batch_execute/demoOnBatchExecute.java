package com.batch_execute;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class demoOnBatchExecute {

	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		try {
			DatabaseMetaData dbMetsData = conn.getMetaData();
			
			//checks whether batch processing is supported or not
			if(dbMetsData.supportsBatchUpdates()) {
				System.out.println("true");
			} else {
				System.out.println("batch updates not supported");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
//		if(conn != null) {
//			System.out.println("working");
//		}
		
		
		
		
//		try {
//			conn.setAutoCommit(false);
//			Statement stmt = conn.createStatement();
//			stmt.addBatch("insert into batchtemp (name) values ('murali')");
//			stmt.addBatch("insert into batchtemp (name) values ('anand')");
//			
//			stmt.executeBatch();
//			conn.commit();
//			conn.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Scanner sc = new Scanner(System.in);
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into batchtemp (name) values (?)");
			
			while(true) {
				System.out.println("enter name");
				
				String name = sc.next();
				
				pstmt.setString(1, name);
				
				
				pstmt.addBatch();
				
				System.out.println("want to add more records y/n");
				String ans = sc.next();
				if(ans.equals("n")) {
					break;
				}
			}
			pstmt.executeBatch();
			System.out.println("success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
