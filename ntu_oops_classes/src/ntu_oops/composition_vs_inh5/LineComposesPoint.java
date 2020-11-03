package ntu_oops.composition_vs_inh5;

import static java.lang.Math.*;



public class LineComposesPoint {

	private Point begin;
	private Point end;

	public LineComposesPoint(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}

	public LineComposesPoint() {
	}

	public LineComposesPoint(int beginX, int beginY, int endX, int endY) {
		this.begin = new Point(beginX, beginY);
		this.end = new Point(endX, endY);
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public void setBeginX(int beginX) {
		begin.setPoint1(beginX);
	}

	public void setBeginY(int beginY) {
		begin.setPoint2(beginY);
	}

	public void setBeginXY(int beginX, int beginY) {
		begin.setPoint1Point2(beginX, beginY);
	}

	public void setEndX(int endX) {
		begin.setPoint1(endX);
	}

	public void setEndY(int endY) {
		begin.setPoint2(endY);
	}
	
	public void setEndXY(int endX, int endY) {
		begin.setPoint1Point2(endX, endY);
	}

	public int getBeginX() {
		return begin.getPoint1();
	}

	public int getBeginY() {
		return begin.getPoint1();
	}

	public int getEndX() {
		return end.getPoint1();
	}

	public int getEndY() {
		return end.getPoint1();
	}

	public double lengthOfLine() {
		int point1 = getEndX()- getBeginX();
		int point2 = getEndY() - getEndY();
		double lengthOfLine = sqrt(pow(point1,2) + pow(point2, 2));
		return lengthOfLine;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Line [begin=");
		builder.append(begin);
		builder.append(", end=");
		builder.append(end);
		builder.append("]");
		return builder.toString() ;
	}
}
