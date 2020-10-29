package com.excpn_in_threading;

import java.lang.Thread.UncaughtExceptionHandler;

class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println("job is in process");
		if(1==1) {
			throw new RuntimeException("some runtime error occured..");
		}
		System.out.println("job done");
	}
	
}
class MyException implements UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(t + " got this problem " + e);
	}
	
}
public class DemoExceptionInClassicalThreads {

		public static void main(String[] args) {
			
			MyJob myJob = new MyJob();
			Thread.currentThread().setDefaultUncaughtExceptionHandler(new MyException());
			Thread thread = new Thread(myJob, "A");
			thread.setUncaughtExceptionHandler(new MyException());
			thread.start();
		}
}
