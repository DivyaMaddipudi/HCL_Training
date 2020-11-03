package ntu_oops.Exercise6;

public abstract class Shape {
	
	protected String color = "red";
	protected boolean filled = true;
	
	public Shape() {
	}

	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shape [color=");
		builder.append(color);
		builder.append(", filled=");
		builder.append(filled);
		builder.append("]");
		return builder.toString();
	}
}
