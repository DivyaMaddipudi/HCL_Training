package com.java_eight;

interface ImpLogic {
	
	int i=10; // public static and final
	public void logic1();
	public default void logic2() {
		System.out.println("some default logic2 method...");
	}
	
	public static void impLogicStaticMethod() {
		System.out.println("impLogicStaticMethod");
	}
}

class A implements ImpLogic {

	@Override
	public void logic1() {
		System.out.println("implemented by A");
	}
	
	public static void hello() {
		System.out.println("impLogicStaticMethod");
	}
}

class B implements ImpLogic {

	@Override
	public void logic1() {
		System.out.println("implemented by B");
	}
	
	@Override
	public void logic2() {
		System.out.println("default by team b");
	}
	
}

class C implements ImpLogic {

	@Override
	public void logic1() {
		System.out.println("implemented by C");
	}
}

public class DemoOnJava8 {
	
	public static void main(String[] args) {
		
		//Interface Evoluation
//		ImpLogic.impLogicStaticMethod();
		
		ImpLogic imp = new B();
		imp.logic2();
		
		
		
		
	}
}
