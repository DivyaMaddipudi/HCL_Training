package com.day2.relations;

public class Pen {
	private String brand;
	private double price;
	private Refill refill;
	
	public Pen(String brand, double price, Refill refill) {
		this.brand = brand;
		this.price = price;
		this.refill = refill;
	}

	public String displayDetails() {
		return brand +" brand of " + price + " and colour of " + refill.getInkColor();
	}
	
 	
	
}
