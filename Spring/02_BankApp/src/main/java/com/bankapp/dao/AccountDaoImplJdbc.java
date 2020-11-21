package com.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.bankapp.exceptions.AccountNotFoundException;

@Primary
@Repository
public class AccountDaoImplJdbc implements AccountDao{
	
	private DataSource dataSource;
	
	public AccountDaoImplJdbc(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Account> getAllAccounts() {
		List<Account> accounts = new ArrayList<Account>();
		Account account = null;
		
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from account_table");
			
			while(rs.next()) {
				account = new Account(rs.getInt("id"), rs.getString("name"), rs.getInt("salary"));
				accounts.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accounts;
		
	}

	public void update(Account account) {
		
		Account accountToUpdate = findAccountById(account.getId());
		Connection conn;
		
		try {
			conn  = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("update account_table set salary = ? where id = ?");
			pstmt.setInt(1, account.getBalance());
			pstmt.setInt(2, account.getId());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Account findAccountById(int id) {
		Connection conn;
		Account account = null;
		
		try {
			conn  = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("select * from account_table where id = ?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				account = new Account(rs.getInt("id"), rs.getString("name"), rs.getInt("salary"));
			
			} else {
				throw new AccountNotFoundException("account with id " + id + "not founr");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return account;
	}
}
