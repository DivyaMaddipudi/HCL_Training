package com.example.looseCoupling;

interface Vehicle {
	 void move(String source, String dest);
}
class Metro implements Vehicle {
	public void move(String source, String dest) {
		System.out.println("moving from " + source +" to " +  dest);
	}
}

class Passanger {
	private String name;
	
	public Passanger(String name) {
		this.name = name;
	}
	
	public void travel(String source, String dest, Vehicle vehicle) {
		vehicle.move(source, dest);
	}
}

public class DemoOnLooseCoupling {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Metro();
		Passanger pass = new Passanger("divya");
		pass.travel("delhi", "mumbai", vehicle);
		
	}
}
