package com.exception_examples;


public class Account {
	
	private int id;
	private String name;
	private int balance;
	
	private static int accountIdCounter = 0;
	

	public Account(String name, int balance) throws AccountCreationException {
		if(balance < 1000) 
			throw new AccountCreationException("account can't be created with " +balance + "  , 1000 is the min amount");
		

		this.id = ++accountIdCounter;
		this.name = name;
		this.balance = balance;
	}
	public void withDraw(int amount) throws NotSufficientFundException {
		int tempBal = balance - amount;
		if(tempBal < 1000) {
			throw new NotSufficientFundException("you must have min balance 1000 all the time");
		}
		balance = tempBal;
		System.out.println(balance);
	}
	
	public void deposit(int amount) throws NotSufficientFundException, OverFundException {
		int tempBal = balance + amount;
		if(tempBal >= 5000000) {
			throw new OverFundException(balance + " is overloaded plz.. meet branch manager");
		}
		balance = tempBal;
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
