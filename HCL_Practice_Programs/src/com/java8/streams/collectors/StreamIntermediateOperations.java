package com.java8.streams.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamIntermediateOperations {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		
		//filter
		memberNames.stream().filter(name -> name.startsWith("A"))
		.forEach(System.out::println);
		
		//map
		memberNames.stream().filter(name -> name.startsWith("A"))
		.map((name) -> name.toUpperCase())
		.forEach(System.out::println);
		
		//sorted
		System.out.println("-----------------sorted----------------------");
		
//		memberNames.stream()
//		.sorted()
//		.map(name -> name.toUpperCase())
//		.forEach(name -> System.out.println(name));
		
		memberNames.stream()
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		
		
		
	}

}
