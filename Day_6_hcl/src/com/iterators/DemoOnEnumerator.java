package com.iterators;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class DemoOnEnumerator {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("divya");
		v.add("satya");
		v.add("riya");
		v.add("raj");
		
//		Enumeration<String> en = v.elements();
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
//		
//		Iterator<String> it = v.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		ListIterator<String> listIt = v.listIterator();
//		//u can itarate back and forth
//		
//		while(listIt.hasNext()) {
//			System.out.println(listIt.next());
//		}
		
		//Doing CRUD with list iterator
		System.out.println(v);
		
		ListIterator<String> it = v.listIterator();
		while(it.hasNext()) {
			String val = it.next();
			//update opn
			if(val.equals("raj")) {
				it.set("ram");
			}
			
			if(val.equals("satya")) {
				it.add("veenai");
			}
			
			if(val.equals("riya")) {
				it.remove();
			}
		}
		System.out.println(v);
	}
}
