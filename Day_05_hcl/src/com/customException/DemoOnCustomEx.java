package com.customException;
import static java.lang.Math.*;

//custom exception

class NegativeRadiusException extends Exception{
	public NegativeRadiusException(String message) {
		super(message);
		
	}
}


class Circle {
	private int radius;
	
	//throw vs throws
	
	
	
	public Circle(int radius) throws NegativeRadiusException {
		if(radius <= 0) 
			throw new NegativeRadiusException("radius: " + radius + "is not possible");
		this.radius = radius;
	}
	
	public double getArea() {
		return PI* radius * radius;
	}
	
}

public class DemoOnCustomEx {
	
	public static void main(String[] args){
		Circle cir = null;
		try {
			cir = new Circle(5);
		} catch (NegativeRadiusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cir.getArea());
		
	}

}
