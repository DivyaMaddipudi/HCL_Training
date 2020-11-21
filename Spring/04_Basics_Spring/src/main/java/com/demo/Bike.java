package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class Bike implements Vehicle{

	@Value(value = "1000")
	private double price;
	
	@Value(value = "100")
	private int speed;
	
	public void setPrice(double price) {
		this.price = price;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

//	public Bike() {
//		
//	}
//	

//	public Bike(double price, int speed) {
//		this.price = price;
//		this.speed = speed;
//	}


	@Override
	public void Move() {
		System.out.println("vehicle is moving with speed " + speed);
		
	}

}
