package com.function_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerFI {
	
	public static void main(String[] args) {
		
		//used for hashmap
		BiConsumer<String, String> biConsumer = (String t, String u) -> System.out.println(t + ":" + u);
		
		
		//consumer: takes something and does not return anything
		List<String> names = Arrays.asList("raj", "divya", "satya");
		
		//java 7
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		//java 8: better in performance and support parallel processing
		Consumer<String> c = name -> System.out.println(name);
//		names.forEach(name -> System.out.println(name));
//		names.forEach(c);
//		names.forEach(System.out::print);
		
		
			
//		Consumer<String> string = str -> System.out.println(str);
//		string.accept("Hello, java");
//		
//		Emp emp1 = new Emp(2, "ria", 50000, "IT");
//		System.out.println(emp1);
//		
//		Consumer<Emp> consumer = (emp) -> System.out.println(emp);
//		consumer.accept(emp1);
	}

}
