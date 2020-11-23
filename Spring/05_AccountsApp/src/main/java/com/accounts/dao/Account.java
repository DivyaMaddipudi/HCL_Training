package com.accounts.dao;

import java.util.Date;

public class Account {
	private long id;    
	private String ownerName;    
	private double balance;    
	private Date accessTime;
	
	public Account() {
	}
	
	public Account(long id, String ownerName, double balance, Date accessTime) {
		this.id = id;
		this.ownerName = ownerName;
		this.balance = balance;
		this.accessTime = accessTime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getAccessTime() {
		return accessTime;
	}
	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=");
		builder.append(id);
		builder.append(", ownerName=");
		builder.append(ownerName);
		builder.append(", balance=");
		builder.append(balance);
		builder.append(", accessTime=");
		builder.append(accessTime);
		builder.append("]");
		return builder.toString();
	}
	
	

}
