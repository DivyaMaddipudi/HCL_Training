package ntu_oops.composition_vs_inh52;

public class Cylinder {
	
	private Circle base;
	private double height;
	
	public Cylinder() {
		base = new Circle();
	}
	
	public Cylinder(Circle base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public Circle getBase() {
		return base;
	}
	
	public void setBase(Circle base) {
		this.base = base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cylinder [base=");
		builder.append(base);
		builder.append(", height=");
		builder.append(height);
		builder.append("]");
		return builder.toString();
	}
}
