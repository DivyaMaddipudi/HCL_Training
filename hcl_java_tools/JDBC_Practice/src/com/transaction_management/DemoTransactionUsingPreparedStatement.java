package com.transaction_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.batch_execute.ConnectionFactory;

/**
 * @author divya
 *
 */
public class DemoTransactionUsingPreparedStatement {
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionFactory.getConnection();
		Scanner sc = new Scanner(System.in);
		try {
			conn.setAutoCommit(false);
			PreparedStatement pstmt = null;
			
			while(true) {
				/*
				 * 
				 * Improvements: check account exist or not and then debit or credit the money
				 * 
				 */
				pstmt = conn.prepareStatement("update transaction_ex set balance = balance - ? where id = ?");
				System.out.println("Enter account id: ");
				int id = sc.nextInt();
				System.out.println("Enter balance to be debited: ");
				int debit = sc.nextInt();
				pstmt.setInt(1, debit);
				pstmt.setInt(2, id);
				pstmt.executeUpdate();
				
				
				pstmt = conn.prepareStatement("update transaction_ex set balance = balance + ? where id = ?");
				System.out.println("Enter account id of money to be credited: ");
				int  creditToAccountId = sc.nextInt();
				System.out.println("Enter balance to be debited: ");
				pstmt.setInt(1, debit);
				pstmt.setInt(2, creditToAccountId);
				pstmt.executeUpdate();
				
				
				System.out.println("commit/rollback");
				String action = sc.next();
				
				if(action.equals("commit")) {
					conn.commit();
				} if(action.equals("rollback")) {
					conn.rollback();
				}

				System.out.println("Still you want to transfer money? y/n");
				String transferMoney = sc.next();
				
				if(transferMoney.equals("n")) {
					break;
				}
			}
			conn.commit();
			System.out.println("money transferred successfully...!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
