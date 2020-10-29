package com.conversions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HowToConvertToThreadSafe {
	
	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		System.out.println("-----------------------");
		List<String> list1 = Collections.synchronizedList(new LinkedList<String>());
		
	}
}
