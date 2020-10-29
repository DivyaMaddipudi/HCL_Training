package com.threads;

class MyThread extends Thread {
	public void run() {
		System.out.println("my job to be done by the thread....");
	}
}

public class DemoOnAnotherWay {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
