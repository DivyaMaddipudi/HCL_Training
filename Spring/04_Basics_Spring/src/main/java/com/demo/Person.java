package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "person")
public class Person {

	
	private Vehicle vehicle;
	
	
	private String personName;
	
	
	public Person() {
		
	}
	
	@Autowired
	public Person(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	

	
//	@Autowired
//	 public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}
	
	 
	@Value(value = "divya")
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void travel() {
		System.out.println("moving all.....");
		System.out.println("name of owner: " + personName);
		vehicle.Move();
	}
}
