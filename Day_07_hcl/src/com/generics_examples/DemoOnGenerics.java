package com.generics_examples;

import java.util.*;


public class DemoOnGenerics {
	public static void main(String[] args) {

		List<String> stringList = new ArrayList<>();
		stringList.add("hello");
		stringList.add("divya");
		stringList.add("good");
		stringList.add("morning");
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		
		List<Double> list2 = new ArrayList<>();
		list2.add(5.0);
		list2.add(6.0);
		list2.add(7.0);
		list2.add(8.0);
		
		consumerMethod(list2);
		printAll(list2);
	}
	
	private static void consumerMethod(List<? super Double> list) {
		list.add(10.0);		
	}
	
	private static void printAll(List<? extends Object> list) {
		for(Object temp : list) {
			System.out.println(temp);
		}
		
	}
}
