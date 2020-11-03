package ntu_oops.composition_vs_inh5;

public class Point {

	private int point1;
	private int point2;

	public Point(int point1, int point2) {
		super();
		this.point1 = point1;
		this.point2 = point2;
	}

	public Point() {
		super();
	}

	public int getPoint1() {
		return point1;
	}

	public void setPoint1(int point1) {
		this.point1 = point1;
	}

	public int getPoint2() {
		return point2;
	}

	public void setPoint2(int point2) {
		this.point2 = point2;
	}
	
	public void setPoint1Point2(int point1, int point2) {
		this.point1 = point1;
		this.point2 = point2;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Point [point1=");
		builder.append(point1);
		builder.append(", point2=");
		builder.append(point2);
		builder.append("]");
		return builder.toString();
	}
}
