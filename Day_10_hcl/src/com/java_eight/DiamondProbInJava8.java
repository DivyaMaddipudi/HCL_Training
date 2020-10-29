package com.java_eight;

interface AB {
	
	public default void foo() {
		System.out.println("AB");
	}
}

interface AC {
	
	public default void foo() {
		System.out.println("AC");
	}
}

class CD implements AB, AC {

	@Override
	public void foo() {
		
		AB.super.foo();
		System.out.println("def method overriden");
	}
	
	
}

public class DiamondProbInJava8 {
	
	public static void main(String[] args) {
		AB a = new CD();
		a.foo();
		
	}
}
