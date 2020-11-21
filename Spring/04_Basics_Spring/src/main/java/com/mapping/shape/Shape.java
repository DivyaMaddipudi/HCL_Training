package com.mapping.shape;

import java.util.List;

public class Shape {
	private List<Point> points;

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public List<Point> getPoints() {
		return points;
	}



	public void printDetails() {
		System.out.println("-------------points-------------");
		points.forEach(a->System.out.println(a));
	}
}
