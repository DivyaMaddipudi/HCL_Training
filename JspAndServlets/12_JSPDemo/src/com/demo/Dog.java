package com.demo;

public class Dog {
	

	public Dog(String dogName) {
		super();
		this.dogName = dogName;
	}
	
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}


	private String dogName;

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dog [dogName=");
		builder.append(dogName);
		builder.append("]");
		return builder.toString();
	}

}
