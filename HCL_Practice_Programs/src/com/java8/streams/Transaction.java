package com.java8.streams;

public class Transaction {
	
	private int price;
	private Currency currency;
	
	public Transaction() {
		
	}

	public Transaction(int price, Currency currency) {
		super();
		this.price = price;
		this.currency = currency;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transaction [price=");
		builder.append(price);
		builder.append(", currency=");
		builder.append(currency);
		builder.append("]");
		return builder.toString();
	}
}
