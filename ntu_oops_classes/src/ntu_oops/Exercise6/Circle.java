package ntu_oops.Exercise6;

import static java.lang.Math.*;

public class Circle extends Shape{

	protected double radius = 1.0;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String colour, boolean filled) {
		super(colour, filled);
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double area = PI * pow(radius, 2);
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2 * PI * radius;
		return perimeter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString()+super.toString();
	}
	
	

}
