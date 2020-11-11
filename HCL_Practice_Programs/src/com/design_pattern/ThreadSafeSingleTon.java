package com.design_pattern;

public class ThreadSafeSingleTon {
	
	private static ThreadSafeSingleTon instance;
	private ThreadSafeSingleTon() {}
	
	public static synchronized ThreadSafeSingleTon getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleTon();
		}
		return instance;
	}
	

}
