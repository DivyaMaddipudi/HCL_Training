package com.example.callByValue;


class Val {
	
	private int i;

	public Val(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}

public class DemoCallByValue {

	public static void main(String[] args) {
		// call by value and call by ref
		
		int i;
		int j;
		i = 10;
		j = 20;
		
		Val val1 = new Val(10);
		Val val2 = new Val(20);
		
		myMethod(val1);
		System.out.println(val1.getI());
//		System.out.println("before swapping" + "i:" + val1.getI() +"j:" + val2.getI());
//		swap(val1, val2);
//		System.out.println("before swapping" + "i:" + val1.getI() +"j:" + val2.getI());
	}

	private static void myMethod(Val val1) {
		val1.setI(30);;
		
	}

	private static void swap(Val val1, Val val2) {
		Val temp = val1;
		val1 = val2;
		val2 = temp;
		
	}
}
