package com.day2.relations;

public class PenAndRefill {
	
	public static void main(String[] args) {
		
		Refill refil = new Refill("Red", "reynolds");
		Pen pen = new Pen("Reynolds", 10.0, refil);
		
		Person p = new Person();
		p.write("Divya", pen);
		
		
	}

}
