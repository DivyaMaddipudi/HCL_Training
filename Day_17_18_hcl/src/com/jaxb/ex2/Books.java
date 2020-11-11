package com.jaxb.ex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="books", propOrder = {"id", "title", "price", "copies"})
public class Books {
	
	private double price;
	private String title;
	private int id;
	private int copies;
	
	public Books() {
	}
	
	public Books(int id, String title, double price, int copies) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.copies = copies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Books [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", price=");
		builder.append(price);
		builder.append(", copies=");
		builder.append(copies);
		builder.append("]");
		return builder.toString();
	}
	
	

}
