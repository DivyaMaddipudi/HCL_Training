package com.map;

import java.util.*;
import java.util.Map.Entry;

public class DemoOnHasMap {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("divya", 1);
		map.put("satya", 2);
		map.put("riya", 3);
		map.put("ram", 4);
		
//		Set<String> keys = map.keySet();
//		for(String key:keys) {
//			System.out.println(key + ":" + map.get(key));
//		}
		
		//Alt + shift + L
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
}
