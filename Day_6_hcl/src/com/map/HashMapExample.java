package com.map;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		System.out.println(args.length);
		Map<String, Integer> map = new LinkedHashMap<>();
		Map<String, Integer> map1 = new LinkedHashMap<>();
		
		map.put("apple", 5);
		map.put("mango", 6);
		map.put("apple", 2);
		map.put("mango", 3);
		map.put("banana", 7);
		
		List<String> stringList = new ArrayList(map.keySet());
		List<String> valuesList = new ArrayList(map.values());
		
		
		for(int i=0;i<stringList.size();i++) {
			
			System.out.println(stringList.get(i));
//			if(map1.containsKey(stringList[i])) {
				
		}
		
		
		
		
		
		
		
		
		
//		int sum = 0;
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//		for (Entry<String, Integer> fruit : entrySet) {
//			System.out.println(fruit.getKey() + " : " + fruit.getValue());
//			if (map1.containsKey(fruit.getKey())) {
//				Set<Entry<String, Integer>> entrySet1 = map.entrySet();
//				for (Entry<String, Integer> fruit1 : entrySet) {
//					sum = fruit1.getValue() + fruit.getValue();
//					System.out.println(sum);
//					 map1.put(fruit.getKey(), sum);
//				}
//			} else {
//				map1.put(fruit.getKey(), fruit.getValue());
//				System.out.println(fruit.getKey());
//				System.out.println(fruit.getValue());
//			}
		}
		
//		Set<Entry<String, Integer>> entrySet2 = map1.entrySet();
//		for(Entry<String, Integer> res : entrySet2) {
//			System.out.println(res.getKey() + " : " + res.getValue());
//		}
	}

