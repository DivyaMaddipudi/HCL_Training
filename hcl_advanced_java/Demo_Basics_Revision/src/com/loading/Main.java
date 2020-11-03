package com.loading;

public class Main {
	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		double mb = 1024*1024;
		System.out.println(runtime.freeMemory()/mb);
		System.out.println(runtime.maxMemory()/mb);
		System.out.println(runtime.totalMemory()/mb);
				
	}
}
