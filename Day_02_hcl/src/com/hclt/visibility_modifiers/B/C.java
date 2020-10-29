package com.hclt.visibility_modifiers.B;

import com.hclt.visibility_modifiers.A.*;

public class C extends A {
	
	public static void main(String[] args) {		
		C a = new C();
		System.out.println(a.publicVar);
		System.out.println(a.protectedVar);
		System.out.println();
		a.printPublic();
		a.printProtected();
		
	}

}
