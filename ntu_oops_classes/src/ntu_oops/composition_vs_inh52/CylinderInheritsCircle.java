package ntu_oops.composition_vs_inh52;

public class CylinderInheritsCircle extends Circle{
	
	private double height;
	
	public CylinderInheritsCircle() {
		
	}
	
	public CylinderInheritsCircle(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}

	public CylinderInheritsCircle(Circle circle, double height) {
		super(circle.getRadius(), circle.getColor());
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getRadius() {
		return super.getRadius();
	}
	
	public String getColor() {
		return super.getColor();
	}
	
	public void setRadius(double radius) {
		super.setRadius(radius);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CylinderInheritsCircle [height=");
		builder.append(height);
		builder.append("]");
		return builder.toString()+super.toString();
	}
}
