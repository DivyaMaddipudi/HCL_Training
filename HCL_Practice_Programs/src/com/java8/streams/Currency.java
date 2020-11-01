package com.java8.streams;

public class Currency {
	
	private String currency;
	
	public Currency() {
	}

	public Currency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Currency [currency=");
		builder.append(currency);
		builder.append("]");
		return builder.toString();
	}
	
	
}
