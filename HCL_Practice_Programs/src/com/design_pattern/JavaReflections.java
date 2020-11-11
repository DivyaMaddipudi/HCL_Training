package com.design_pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


class SingleTon {
	
	private static SingleTon instance = new SingleTon();
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		return instance;
	}
}

public class JavaReflections {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SingleTon singleton = SingleTon.getInstance();
		System.out.println(singleton.hashCode());
		Constructor[] constructors = singleton.getClass().getDeclaredConstructors();
		
		constructors[0].setAccessible(true); //that i want to call private constructor even
		
		SingleTon singleton2 = (SingleTon) constructors[0].newInstance();
		
		System.out.println(singleton2.hashCode());
		
	}

}
