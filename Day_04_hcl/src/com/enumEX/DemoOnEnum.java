package com.enumEX;


enum ShirtSize {
	 S(38), M(40), L(42), XL(44);

	private int size;

	private ShirtSize(int size) {
		System.out.println(size);
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}

class Shirt {
	private String brand;
	private String color;
	private double price;
	private ShirtSize size;
	
	
	
	public Shirt(String brand, String color, double price, ShirtSize size) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ShirtSize getSize() {
		return size;
	}
	public void setSize(ShirtSize size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", color=" + color + ", price=" + price + ", size=" + size + "]";
	}
}

public class DemoOnEnum {

	public static void main(String[] args) {

		ShirtSize shirtSize = ShirtSize.M;
		
		//shift + alt + L
		ShirtSize[] values = shirtSize.values();
		
		for(ShirtSize temp: values) {
			System.out.println(temp + ": " + temp.ordinal());
		}
		
		ShirtSize s = shirtSize.L;
		
		Shirt shirt = new Shirt("USP", "black", 100.0, s);
	}

}
