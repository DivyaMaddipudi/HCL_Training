package com.exceptionHand;

public class DemoFinally {
	
	public static void main(String[] args) {
		int val = myMethod();
		System.out.println(val);
		
		try {
			myMethod2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void myMethod2() {
		
		try {
			if(1 == 1) 
				throw new NullPointerException();
		} finally {
			 throw new ArithmeticException();
		}
	}

	private static int myMethod() {
		
		try {
			//BL
			if(1 == 1) 
				return 4;
		} finally {
			//Cleanup code!
			return 0;
		}
	}
}
