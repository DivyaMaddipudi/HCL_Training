package com.exception_in_threads;

import java.lang.Thread.UncaughtExceptionHandler;

class MyJob implements Runnable {

	@Override
	public void run() {
		if(1==1) {
			throw new RuntimeException("ex was thrown");
		}
		
	}
	
}

class MyExceptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(t.getName()+":"+e.getCause());
		
	}
}

class MyExceptionHandlerThread1 implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(t.getName()+":"+e.getCause());
		
	}
}
public class ExceptionInThreads {
	
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new MyExceptionHandler());
		MyJob job = new MyJob();
		try {
			Thread t1 = new Thread();
			t1.setUncaughtExceptionHandler(new MyExceptionHandlerThread1());
			t1.start();
		}catch (Exception e) {
			System.out.println("handled");
		}
		
	}

}
