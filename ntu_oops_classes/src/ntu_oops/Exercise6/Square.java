package ntu_oops.Exercise6;

public class Square extends Rectangle{
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.setWidth(side);
		
	}
	
	public Square(double side, String color, boolean filled) {
		super.setColor(color);
		super.setFilled(filled);
		this.setWidth(side);
		
	}
	
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
	}

	@Override
	public double getArea() {
		double area = width * width;
		return area;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Square [width=");
		builder.append(width);
		builder.append(", length=");
		builder.append(length);
		builder.append(", color=");
		builder.append(color);
		builder.append(", filled=");
		builder.append(filled);
		builder.append("]");
		return builder.toString()+super.toString();
	}	
}
