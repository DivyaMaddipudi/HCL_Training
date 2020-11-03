package com.loading;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DemoGc {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		Constructor[] constructors = Runtime.class.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		
		Runtime runtime = (Runtime) constructors[0].newInstance();
		
		System.out.println(Runtime.getRuntime().hashCode());
		System.out.println(runtime.hashCode());
		
//		try{
//			Thread.sleep(10000000);
//		} catch (InterruptedException e) {
//			
//		} // VisualVM
		
		
//		long freeMemory = Runtime.getRuntime().freeMemory();
//		System.out.println(freeMemory/(1024*1024));
//		
//		for(long temp=0;temp<100000;temp++) {
//			Foo foo = new Foo(1213, "divya"+temp);
//		}
//		
//		//conceptually no difference b/w these two methods
////		System.gc();// req for gc to come on and clean the memory...
//		Runtime.getRuntime().gc();
//		freeMemory = Runtime.getRuntime().freeMemory();
//		System.out.println(freeMemory/(1024*1024));
	}

}
