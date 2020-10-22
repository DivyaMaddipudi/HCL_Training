package com.generics;

import java.util.ArrayList;
import java.util.Collections;

public class DontMixGenericAndNonGenCode {
		
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("divya");
		list.add("satya");
		list.add("riya");
		list.add("raj");
		
		
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		

		int index = Collections.binarySearch(list, "rose");
		System.out.println(index);
	}

}
