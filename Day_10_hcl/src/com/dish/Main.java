package com.dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Dish> dishList = getAll();
		
//		System.out.println("------------------printing all the food items-------------");
//		dishList.forEach(System.out::println);
		
		//return the names of dishes that are low in calories (<400), 
//		sorted by number of calories
	
		System.out.println("-----------------all dishes name low in calaries---------------------");
		List<String> dishName = dishList.stream()
								.filter(dish->dish.getCalories()<400)
								.sorted(Comparator.comparing(Dish::getCalories))
								.map(dish->dish.getName())
								.sorted(Comparator.reverseOrder())
								.collect(Collectors.toList());
		dishName.forEach(System.out::println);
		
		
		System.out.println("---------------print all the vegeterian food------------------------");
		
		List<Dish> allVeg = dishList.stream()
									.filter(dish->dish.getType()==Dish.Type.OTHER) //dish->dish.isVegetarian()
									.collect(Collectors.toList());
		allVeg.forEach(System.out::println);
		
		System.out.println("---------------print all the fish food------------------------");
		
		List<Dish> allFish = dishList.stream()
									.filter(dish->dish.getType()==Dish.Type.FISH) 
									.collect(Collectors.toList());
		allFish.forEach(System.out::println);
		
		//find out whether menu has veg option
		
		boolean isVeg = dishList.stream().anyMatch(dish -> dish.isVegetarian());
		if(isVeg)
			System.out.println("Yes available");
		else 
			System.out.println("enjoy juice...!");
		
		//is menu is healthy cal < 500
		
		if(dishList.stream().allMatch(dish -> dish.getCalories()<500)) {
			System.out.println("yes healthy");
		}else {
			System.out.println("no");
		}
		
		if(dishList.stream().noneMatch(dish -> dish.getName().contains("rice"))) {
			System.out.println("No name with 'a' dish");
		} else {
			System.out.println("yes! available");
		}
		
		Optional<Dish> optFood = dishList.stream().filter(dish->dish.isVegetarian()).findAny();
		
		Dish value = optFood.orElseThrow(RuntimeException::new);
		System.out.println(value);
		
		
		
	}

	private static List<Dish> getAll() {
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );

		return menu;
	}
}
