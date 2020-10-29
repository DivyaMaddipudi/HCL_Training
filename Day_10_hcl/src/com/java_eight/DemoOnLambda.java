package com.java_eight;


interface Greet {
	public String greet(String a);
	
	public default void defaultGreet() {
		System.out.println("default greet");
	}
}
interface Cal {
	public int add(int a, int b);

	public default void print() {
		System.out.println("it is cal");
	}
}

public class DemoOnLambda {
	public static void main(String[] args) {
		
		Greet greet = (String name) -> "good morning " + name;
		System.out.println(greet.greet("divya"));
		greet.defaultGreet();

//		Cal cal = new Cal() {
//
//			@Override
//			public int add(int a, int b) {
//				// TODO Auto-generated method stub
//				return a + b;
//			}
//		};
//
//		Cal cal2 = (int a, int b) -> a+b;
//		System.out.println(cal2.add(3, 4));

		// Annonymous inner class vs lambda expn.
		// Conceptually they are not same...but most of the time
		// u can replace annoymous inner class with lambds exp

		// rrunnable is pointing to a object

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("hi");

			}
		};

		Runnable runnable2 = () -> System.out.println("hello");
		// runnable start pointing to a method: as happenedd in js
//		runnable.run();
	}
}
