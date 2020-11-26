package com.demo;

public class BookData {
	private String title;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public BookData(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	public BookData() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookData [title=");
		builder.append(title);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
