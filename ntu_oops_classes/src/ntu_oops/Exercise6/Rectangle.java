package ntu_oops.Exercise6;

public class Rectangle extends Shape{
	
	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangle() {
		
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		double area = length * width;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [width=");
		builder.append(width);
		builder.append(", length=");
		builder.append(length);
		builder.append("]");
		return builder.toString()+super.toString();
	}
	
	
}
