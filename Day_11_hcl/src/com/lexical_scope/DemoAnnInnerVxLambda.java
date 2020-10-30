package com.lexical_scope;

class Foof {
	int i =66;
	
	public void foof() {
		int i =55;
		Runnable run = () -> System.out.println(this.i);
		run.run();
		
//		Runnable run = new Runnable() {
//			int i = 55;
//			@Override
//			public void run() {
//				System.out.println(this.i);
//				
//			}
//		};
//		run.run();
	}
}
public class DemoAnnInnerVxLambda {
	public static void main(String[] args) {
		Foof f = new Foof();
		f.foof();
	}
}
