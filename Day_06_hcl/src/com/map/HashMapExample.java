package com.map;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {

		Map<String, Integer> hMap = new HashMap<>();
		List<String> fruitArr = new ArrayList<>();
		List<Integer> quantityArr = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter size");
			int size = sc.nextInt();
			for (int i = 0; i < size; i++) {
				System.out.println("Fruit name: ");
				String fruitName = sc.next();
				fruitArr.add(fruitName);
				System.out.println("Enter quantity: ");
				int quantity = sc.nextInt();
				quantityArr.add(quantity);

			}

		}

		for (int i = 0; i < fruitArr.size(); i++) {
			
			if(hMap.containsKey(fruitArr.get(i))) {
				int value =  quantityArr.get(i)+ hMap.get(fruitArr.get(i));
				System.out.println();
				hMap.put(fruitArr.get(i), value);
			} else {
				hMap.put(fruitArr.get(i), quantityArr.get(i));
			}
		}
		
		System.out.println("fruits and initial quantity");
		for (int i = 0; i < fruitArr.size(); i++) {
			System.out.println(fruitArr.get(i) + " = " + quantityArr.get(i));
		}
		
		System.out.println("final quantity of all fruits!");
		Set<Entry<String, Integer>> totalSumOfFruits = hMap.entrySet();
		for(Entry<String, Integer> fruitsSum : totalSumOfFruits) {
			System.out.println(fruitsSum.getKey() + " = " + fruitsSum.getValue());
		}
	}
}
