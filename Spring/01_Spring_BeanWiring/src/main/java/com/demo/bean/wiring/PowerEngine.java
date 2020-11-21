package com.demo.bean.wiring;

public class PowerEngine implements Engine{

	private String brand;
	private int horsePower;
	
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}



	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}



	@Override
	public void move() {
		System.out.println("this car speed is" + horsePower +"brand: " + brand);
		
	}
	
	

}
