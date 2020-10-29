package com.array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("foo");
		list.add("bar");
		list.add("kar");
		
		System.out.println(list);
		
		// enhance for loop: sysntex sugar ----> iterator pattern
//		for(String temp: list) {
//			System.out.println(temp);
//		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
