package com.bankapp.model.dao;

public class Account {
	private int id;
	private String name;
	private double balance;
	
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
