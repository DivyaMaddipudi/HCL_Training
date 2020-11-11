package com.design_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


enum SingleTonPattern { // special type of class
	
	INSTANCE;
	
}

public class DemoEnumImpl {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SingleTonPattern singleton3 = SingleTonPattern.INSTANCE;
		System.out.println(singleton3.hashCode());
		
		SingleTonPattern singleton4 = SingleTonPattern.INSTANCE;
		System.out.println(singleton4.hashCode());
		
//		SingleTon singleton = SingleTon.getInstance();
//		System.out.println(singleton.hashCode());
//		Constructor[] constructors = singleton.getClass().getDeclaredConstructors();
//		
//		constructors[0].setAccessible(true); //that i want to call private constructor even
//		
//		SingleTon singleton2 = (SingleTon) constructors[0].newInstance();
//		
//		System.out.println(singleton2.hashCode());
		
	}

}
