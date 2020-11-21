package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	@Value(value = "red")
	private String color;
	
	@Value(value = "120")
	private int speed;
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void Move() {
		System.out.println("vehicle is moving with speed " + speed + " and color is " + color);
		
	}

}
