package com.threads;

//Annonymous inner class

public class DemoOnAnotherWay1 {
	public static void main(String[] args) {
		
		// passing ann obj
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("job of thread...");
				
			}
		});
		thread.start();
	}
}
