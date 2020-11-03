package ntu_oops.composition_vs_inh5;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class LineInheritsPoint extends Point {
	
	private Point end;
	
	@Override
	public int getPoint1() {
		return super.getPoint1();
	}
	
	@Override
	public int getPoint2() {
		return super.getPoint2();
	}

	public LineInheritsPoint(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end = new Point(endX, endY);
	}
	
	public LineInheritsPoint(Point begin, Point end) {
		super(begin.getPoint1(), begin.getPoint2());
		this.end = end;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public void setBegin(Point begin) {
		super.getPoint1();
		super.getPoint2();
	}
	
	public Point getBegin() {
		return new Point(super.getPoint1(), super.getPoint2());
	}
	
	public int getBeginX() {
		return super.getPoint1();
	}
	
	public int getBeginY() {
		return super.getPoint2();
	}
	
	
	public int getEndX() {
		return end.getPoint1();
	}
	
	public int getEndY() {
		return end.getPoint2();
	}
	
	public void setEndX(int point1) {
		end.setPoint1(point1);
	}
	
	public void setEndY(int point2) {
		end.setPoint1(point2);
	}
	
	public void setEndXY(int point1, int point2) {
		end.setPoint1Point2(point1, point2);
	}
	
	public void setBeginX(int point1) {
		super.setPoint1(point1);
	}
	
	public void setBeginY(int point2) {
		super.setPoint2(point2);
	}
	
	public void setBeginXY(int point1, int point2) {
		super.setPoint1Point2(point1, point2);
	}
	
	public double lengthOfLine() {
		int point1 = getEndX() - getBeginX();
		int point2 = getEndY() - getEndY();
		double lengthOfLine = sqrt(pow(point1,2) + pow(point2, 2));
		return lengthOfLine;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LineInheritsPoint [end=");
		builder.append(end);
		builder.append("]");
		return builder.toString()+super.toString();
	}

}
