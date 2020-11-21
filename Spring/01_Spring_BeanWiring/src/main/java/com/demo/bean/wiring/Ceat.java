package com.demo.bean.wiring;

public class Ceat implements Tyre{

	private double price;
	
	
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public void rotation() {
		System.out.println("tyre is rotating, price of tyre is: " + price);
		
	}
	
	

}
