package ntu_oops.classes2.composition5;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}

	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	@Override
	public String toString() {
		return "MyTriangle [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}

	public double getPerimeter() {

		double v1v2 = Math.sqrt(Math.pow((v1.getX() - v2.getX()), 2) + Math.pow((v1.getY() - v2.getY()), 2));
		double v2v3 = Math.sqrt(Math.pow((v2.getX() - v3.getX()), 2) + Math.pow((v2.getY() - v3.getY()), 2));
		double v3v1 = Math.sqrt(Math.pow((v1.getX() - v3.getX()), 2) + Math.pow((v1.getY() - v3.getY()), 2));

		double parameter = v1v2 + v2v3 + v3v1;
		return parameter;
	}

	public String getType() {

		double a = Math.sqrt(Math.pow((v1.getX() - v2.getX()), 2) + Math.pow((v1.getY() - v2.getY()), 2));
		double b = Math.sqrt(Math.pow((v2.getX() - v3.getX()), 2) + Math.pow((v2.getY() - v3.getY()), 2));
		double c = Math.sqrt(Math.pow((v1.getX() - v3.getX()), 2) + Math.pow((v1.getY() - v3.getY()), 2));
		String type = null;

		if (a == b && b == c)
			type = "Equilateral";
		else if (((a * a) + (b * b)) == (c * c) || ((a * a) + (c * c)) == (b * b) || ((c * c) + (b * b)) == (a * a))
			type = "Right Triangle";
		else if (a != b && b != c && c != a)
			type = "Scalen Triangle";
		else if ((a == b && b != c) || (a != b && c == a) || (c == b && c != a))
			type = "Iscoleses Triangle";
		return type;
	}
}
