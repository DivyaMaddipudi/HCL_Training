package com.bankapp.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
@Inheritance(strategy = InheritanceType.JOINED)
abstract public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACCOUNT_ID")
	private int accountId;
	
	@Column(name = "ACCOUNT_NUMBER", unique = true, nullable = false)
	private String accountNumber;
	
	@Column(name = "ACCOUNT_HOLDER_NAME", nullable = false)
	private String accountHolderName;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	public Account() {
	}
	
	public Account(String accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}
	
	public Account(String accountNumber, String accountHolderName, String password) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.password = password;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accountId=");
		builder.append(accountId);
		builder.append(", accountNumber=");
		builder.append(accountNumber);
		builder.append(", accountHolderName=");
		builder.append(accountHolderName);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
