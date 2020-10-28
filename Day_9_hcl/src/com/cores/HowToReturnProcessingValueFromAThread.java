package com.cores;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Cal implements Runnable {

	private int x;
	private int y;
	private int sum = 0;
	
	
	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		sum = x + y;		
	}
	
	public int getRes() {
//		this.sum = sum;
		return sum;
		
	}
}

public class HowToReturnProcessingValueFromAThread {
	public static void main(String[] args) throws InterruptedException {
		
		Cal cal = new Cal(5, 3);
		Thread thread = new Thread(cal);
		thread.start();
//		thread.run();
		
	    ExecutorService executor = Executors.newSingleThreadExecutor();
	    Callable<Integer> callable = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				return 10;
			}
	        
	    };
	    Future<Integer> future = executor.submit(callable);
	    executor.shutdown();
		System.out.println(cal.getRes());
		
	}
}
