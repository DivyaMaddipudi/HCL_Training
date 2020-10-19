package com.example.polymorphism;

class Calculator {
	
	public static Integer add(Integer a, Integer b) {
		System.out.println("Integer Integer");
		return a+b;
	}
	
//	public static int add(int a, int b) {
//		System.out.println("int int");
//		return a+b;
//	}
	
	//java 5: variable argument method
	public static int add(int ...arr) {
		System.out.println("public static int add(int ...arr) ");
		int sum =0;
		for(int temp: arr) {
			sum += temp;
		}
		return sum;
	}
} 

public class DemoFunctionOverloading {
	
	public static void main(String[] args) {
		
		//Want to use wrapper classes ?
		
//		Integer it = 8;
//		it++;
		
		
		Calculator cal = new Calculator();
		int sum = cal.add(10, 20);
		//int sum = Calculator.add(new Integer(30), new Integer(10));
		System.out.println(sum);
	}

}
