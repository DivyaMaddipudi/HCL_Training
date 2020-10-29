package com.behaviour_parameterization;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Apple {
	private String color;
	private int weight;
	
	//why i defined this method - for method reference
	public boolean isGreen() {
		return color.equals("green");
	}
	
	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Apple [color=");
		builder.append(color);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}
}
class AppleApp {
	
	
	
}
public class Main {
	public static void main(String[] args) {
		
		Predicate<Apple> applesPredicate = Apple::isGreen;
		//looking for all green apples
		//apples -> list of apples
//		List<Apple> apples2 = apples.stream().filter(apple -> apple.getColor().equals("green"))
//								.collect(Collectors.toList());
		
		List<Apple> appleList = getAllApples();
		
		appleList.stream().forEach(apple->System.out.println(apple));
		
	}

	private static List<Apple> getAllApples() {
		List<Apple> tempList = new ArrayList<Apple>();
		tempList.add(new Apple("green", 250));
		tempList.add(new Apple("green", 150));
		tempList.add(new Apple("red", 300));
		tempList.add(new Apple("green", 500));
		tempList.add(new Apple("red", 350));
		return tempList;
	}

}
