package com.example.overriding;

import java.util.Scanner;

abstract class Shape {
	
	private String color;
	
	public Shape() {
		
	}
	
	public Shape(String color) {
		this.color = color;
	}
	
	public void printColor(String color) {
		System.out.println("color: " + color);
	}
	
	public abstract void printArea();
}

class Triangle extends Shape {
	
	public Triangle(String color) {
		super(color);
	}
	
	@Override
	public void printArea() {
		System.out.println("Area of triangle");
	}
}

class Circle extends Shape {
	
	@Override
	public void printArea() {
		System.out.println("Area of circle");
	}
}

class Rectangle extends Shape {
	
	@Override
	public void printArea() {
		System.out.println("Area of rectangle");
	}
}

public class DemoOnOverriding {
	
	public static void main(String[] args) {
		
		
		Shape shape = new Rectangle();
		shape.printArea();
		shape.printColor("red");
		
		
		
		
		
//		Shape shape = null;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please  enter the shape");
//		int choice = sc.nextInt();
//		
//		if(choice == 1) {
//			shape = new Triangle();
//		} else if(choice == 2) {
//			shape = new Circle();
//		} else if(choice == 3) {
//			shape = new Rectangle();
//		}
//		shape.printArea();
//		sc.close();
	}

}
