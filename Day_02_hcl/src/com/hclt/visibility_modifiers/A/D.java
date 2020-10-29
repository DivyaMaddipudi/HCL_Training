package com.hclt.visibility_modifiers.A;


public class D {
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.publicVar);
		System.out.println(a.protectedVar);
		System.out.println(a.defaultVar);
		
		a.printPublic();
		a.printProtected();
		a.printDefault();
	}

}
