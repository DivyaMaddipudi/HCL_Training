package com.day2.relations;

//person uses pen
public class Person {
	
	private String name;
	private String address;
	
	public void write(String name, Pen pen) {
		
		
		System.out.println(name + " using pen of " + pen.displayDetails());
	}

}
