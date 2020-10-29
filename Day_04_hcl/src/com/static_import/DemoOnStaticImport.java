package com.static_import;

import static java.lang.Math.*;


public class DemoOnStaticImport {
	
	public static void main(String[] args) {
		
		double pi = PI;
		double cosValue = cos(10);
		
		int value = MyStaticUtilClass.getModulus(3);
		
		System.out.println(value);
		
		System.out.println(pi);
	}
}
