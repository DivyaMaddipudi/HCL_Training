package com.threads;

class MyJob2 implements Runnable {
	private Thread thread;

	public MyJob2() {
		thread = new Thread(this); // this refer to current obj
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("job done by thread....");

	}

}

public class DemoOnAnotherWay2 {
	public static void main(String[] args) {
		MyJob2 myJob2 = new MyJob2();
		System.out.println("done");
	}
}
