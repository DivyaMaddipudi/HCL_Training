package com.java8.streams.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamCollectors {
	
	public static void main(String[] args) {
		
		//1. collect stream of elements to a list
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		
		Stream<Integer> filterNumbers = list.parallelStream().filter((Integer i) -> i%2 == 0);
//		filterNumbers.forEach(f -> System.out.println(f));
		
		//collect integers in an array
		Integer[] filterrArray = filterNumbers.toArray(Integer[]::new);
		System.out.println(Arrays.asList(filterrArray));
		
	}

}
