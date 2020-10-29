package com.util.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Calc implements Callable<Integer> {
	
	private int x;
	private int y;
	
	public Calc(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public Integer call() throws Exception {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		return x+y;
	}
	
}
public class DemoThreadPoo {
	
	public static void main(String[] args) throws Exception {
		
		Calc cal = new Calc(5, 6);
		System.out.println(cal.call());
	}
	
}
