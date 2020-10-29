package com.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoPerformanceALVsLL {
	
	public static void main(String[] args) {
		
		List<Long> arrLis = new ArrayList<Long>();
		List<Long> linkList = new LinkedList<Long>();
		
		calculateTiming(arrLis);
//		calculateTiming(linkList);
		
	}

	private static void calculateTiming(List<Long> arrLis) {
		for(long i=0;i<10E4;i++) {
			arrLis.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		for(long i=0;i<10E4;i++) {
			arrLis.add(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("time taken:" + (end - start));
		
	}

}
