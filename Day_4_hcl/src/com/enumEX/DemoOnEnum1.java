package com.enumEX;


enum DressSize {
	XS, S, M, L, XL, XXL;
	
	private DressSize() {
		System.out.println("ctr");
	}
	
}
class Dress {
	private String brand;
	private double price;
	private DressSize size;
	
	public Dress(String brand, double price, DressSize size) {
		super();
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public DressSize getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Dress [brand=" + brand + ", price=" + price + ", size=" + size + "]";
	}
	
}

public class DemoOnEnum1 {
	
	public static void main(String[] args) {
		
		//Covert given string to enum
		
		DressSize size = DressSize.valueOf("M");
		System.out.println(size);
		
		String dresSize = DressSize.M.name();
		System.out.println(dresSize);
		
//		DressSize size = DressSize.M;
//		
//		Dress dress = new Dress("PE", 500.0, size);
//		System.out.println(dress.getSize());
		
	}

}
