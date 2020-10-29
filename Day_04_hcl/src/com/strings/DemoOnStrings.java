package com.strings;

public class DemoOnStrings {
	
	public static void main(String[] args) {
		
		String a = "india";
		String b = new String("india").intern();
		
		if(a.equals(b)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
