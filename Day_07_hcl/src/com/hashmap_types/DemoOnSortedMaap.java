package com.hashmap_types;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class DemoOnSortedMaap {
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(1, "value 1");
		map1.put(2, "value 2");
		map1.put(3, "value 3");
		map1.put(4, "value 4");
		map1.put(5, "value 5");
		map1.put(6, "value 6");
		
		SortedMap<Integer, String> map = new TreeMap<>(map1);
		printMap(map);
		System.out.println("-----------------");
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(5));
		System.out.println(map.tailMap(5));
		
		Comparator comparator = map.comparator();
		System.out.println(comparator);
		
	}

	private static void printMap(SortedMap<Integer, String> map) {
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
