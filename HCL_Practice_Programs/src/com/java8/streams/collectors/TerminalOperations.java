package com.java8.streams.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class TerminalOperations {

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

		boolean allMatch = memberNames.stream().allMatch(name -> name.startsWith("A"));

		System.out.println("all match: " + allMatch);

		boolean anyMatch = memberNames.stream().anyMatch(name -> name.startsWith("A"));

		System.out.println("any match: " + anyMatch);

		boolean noneMatch = memberNames.stream().noneMatch(name -> name.startsWith("A"));

		System.out.println("none match: " + noneMatch);
	
		long countNames = memberNames.stream().filter(name -> name.startsWith("A")).count();
		System.out.println("Names with A: " + countNames);
		
		
		Optional<String> reduceNames = memberNames.stream().reduce((String str1, String str2) -> str1 + "#" + str2);
		System.out.println("reduce operation: " + reduceNames);
		
		String findAny = memberNames.stream().filter(a -> a.startsWith("A"))
									.sorted()
									.findAny().get();
		System.out.println("find any: " + findAny);
	}

}
