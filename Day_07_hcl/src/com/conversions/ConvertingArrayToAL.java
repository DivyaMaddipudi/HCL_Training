package com.conversions;
import java.util.*;

public class ConvertingArrayToAL {
	
	public static void main(String[] args) {
		
		String[] names = {"divya", "satya", "riya"};
		List<String> list =Arrays.asList(names);
		
		System.out.println(list);
		names[0] = "veenai";
		System.out.println("--------------------");
		System.out.println(list);
		System.out.println("--------------------");
//		list.add("divya"); //operation unsupported exception
	}

}
