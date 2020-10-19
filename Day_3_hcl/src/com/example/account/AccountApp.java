package com.example.account;

class Account {
	
	private int accId;
	private String name;
	private double balance;
	
	Account() {
		
	}
	public Account(int accId, String name, double balance) {
		super();
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", balance=" + balance + "]";
	}
}

class SavingsAccount extends Account {
	private double interest;
	
	
	
}
public class AccountApp {
	
	public static void main(String[] args) {
		
	}
	

}
