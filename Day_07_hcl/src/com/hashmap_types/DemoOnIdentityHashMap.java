package com.hashmap_types;
import java.util.*;

public class DemoOnIdentityHashMap {
	
	public static void main(String[] args) {
		
		Integer it1 = new Integer(22);
		Integer it2 = new Integer(22);
		
		Map<Integer, String> map = new IdentityHashMap<>();
		map.put(it1, "value 1");
		map.put(it2, "value 2");
		
		
	}

}
