package com.iterator_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(50);
		
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
////			list.add(100); // java.util.ConcurrentModificationException 
//			System.out.println(it.next());
//		}
		
		for(Integer item: list) {
//			item = 400;
			System.out.println(item);
		}
	}

}
