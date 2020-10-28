package com.deadLock;

public class DemoOnDeadLock {
	public static void main(String[] args) {
		final Object resource1 = "resource1";
		final Object resource2 = "resource2";
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("t1 got lock on r1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (resource2) {
						System.out.println("t1 got lock on r2");
					}
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("t2 got lock on r2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (resource2) {
						System.out.println("t2 got lock on r1");
					}
				}
				
			}
		});
		
		thread.start();
		thread2.start();
	}
}
