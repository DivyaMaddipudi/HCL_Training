package com.java8.streams.Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExamples {
	
	public static void main(String[] args) {
		
		//1 
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6); //fixed number of integers
//		stream.forEach(values -> System.out.println(values));
		
		//2. 
		Stream<Integer> streamsValues = Stream.of(new Integer[] {1, 2, 3, 4, 5, 6, 7}); //elements in the stream are taken from array
//		streamsValues.forEach(val -> System.out.println(val));
		
		//3. The elements of the stream are taken from the list
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		Stream<Integer> listOfIntegers = list.stream();
//		listOfIntegers.forEach(s->System.out.println(s));
		
		//4. Stream.generate() or Stream.iterate()
		
		List<Integer> generateRandomNumbers = Stream.generate(() ->  new Random().nextInt(100))
													.limit(10)
													.collect(Collectors.toList());
		
//		generateRandomNumbers.forEach(System.out::println); 
		
		//5. Stream of string chars or tokens
		
		IntStream creatingStreamFromCharacters = "1210_Acdefgz".chars();
//		creatingStreamFromCharacters.forEach(p->System.out.println(p));		
		//OR
		Stream<String> splitAString = Stream.of("ABC$123".split("\\$"));
//		splitAString.forEach(System.out::println);
	}

}
