package com.basics_java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class DemoJVM {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Emp emp1 = new Emp(1, "divya", 3000); //static class loading
		Emp emp2 = new Emp(2, "veenai", 5000);
		
//		System.out.println(emp1.getClass());
//		System.out.println(emp2.getClass());
		
		
		//Dynamic class loading
		Class clzz1 = emp1.getClass();
		
		Class clazz2 = Emp.class;
		
		Class clazz = Class.forName("com.basics_java.Emp");
		
		// how to get info abt metadata of the class
		//java reflection: core java api to get meta data info abt a class
		//meta data: meta info: data abt data: that means if i want to know how many methods, cnstr, field, data etc., is there
		// at runtime i can use Class clss object
		
		Method[] methods = clazz.getMethods();
		
		for(Method method:methods) {
			System.out.println(method.getName()+" : "+ method.getModifiers() + " : " + Modifier.toString(method.getModifiers()));
		}
		
		Constructor[] constructors = clazz.getConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor);
			Parameter[] parameter = constructor.getParameters();
			for(Parameter param: parameter) {
				System.out.println(param);
			}
		}
		
		
	}

}
