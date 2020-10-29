package com.hclt.visibility_modifiers.A;

public class A {
	
	public int publicVar = 10;
	private int privateVar = 20;
	protected int protectedVar = 30;
	int defaultVar = 40;
	
	public void printPublic() {
		System.out.println("Public method.....");
	}
	
	private void printPrivate() {
		System.out.println("private method.....");
	}
	
	protected void printProtected() {
		System.out.println("protected method.....");
	}
	
	void printDefault() {
		System.out.println("default method.....");
	}
 
}
