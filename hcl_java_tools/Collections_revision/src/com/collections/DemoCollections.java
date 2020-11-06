package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoCollections {
	
	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<>();
		list.add(new Book("A123", "java", "raj", 200));
		list.add(new Book("A124", "python", "raj", 300));
		list.add(new Book("A125", "spring", "Bates", 500));
		list.add(new Book("A126", "hibernate", "kr", 250));
		list.add(new Book("A127", "ikigai", "mercia", 100));
		
//		Iterator<Book> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Collections.sort(list);
		list.forEach(System.out::println);
		
		
	}

}
