package com.productsEx;

import java.util.Comparator;


class SortAsPerCaategoryAndThenDiscount implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {
		int value = o1.getCategory().compareTo(o2.getCategory());
		if(value == 0) {
			value = Double.compare(o2.getDiscount(), o1.getDiscount());
		}
		return value;
	}
	
}

class ProductSorterAsPerName implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}

class ProductSorterAsPerDiscount implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {
		
		return Double.compare(o1.getDiscount(), o2.getDiscount());
	}
}

public class Products implements Comparable<Products>{
	
	private int id;
	private String name;
	private double price;
	private String category;
	private double discount;
	
	
	public Products(int id, String name, double price, String category, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.discount = discount;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Products [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", category=");
		builder.append(category);
		builder.append(", discount=");
		builder.append(discount);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Products o) {

		return Integer.compare(this.getId(), o.getId());
	}
	
	

}
