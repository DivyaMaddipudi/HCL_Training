package com.threads;
//Job worke 

class MyJob implements Runnable {

	@Override
	public void run() {
		System.out.println("job started by thread: "+ Thread.currentThread().getName());
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("job done by thread: "+ Thread.currentThread().getName());		
	}
	
}


public class DemoOnThreads {
	public static void main(String[] args) {
		
		System.out.println("main start");
		System.out.println(Thread.currentThread().getName());
		//wait for io/ network call
		
		MyJob job = new MyJob();
		
		Thread thread = new Thread(job, "A1");
		Thread thread1 = new Thread(job, "A2");
		Thread thread2 = new Thread(job, "A3");
		Thread thread3 = new Thread(job, "A4");
		
		//if u call run method it will not start a new thread, rather then it is just a method call!
		thread.start(); //never call the run method ?
//		System.out.println(thread.isAlive());
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		// main should finish at the end
		try {
			thread.join(5000); //thread1 is saying to main hey join after me
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main ends");
	}
}
