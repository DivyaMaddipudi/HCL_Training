package com.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Printer1 {
	
	private Lock lock = new ReentrantLock(true);
	
	//any java object can work as a lock
	//lock is taken on the obj not on the method
	
	//c1, c2, c3
	public void print(String letter) {
		
		lock.lock();
		
		
			System.out.print("[");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			} finally {
				lock.unlock(); 
			}
			System.out.println(letter + "]");
	}
}

class Client1 implements Runnable{
	private Printer printer;
	private Thread thread;
	private String letter;
	public Client1(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		this.thread = new Thread(this);
		this.thread.start();
		
	}

	@Override
	public void run() {
		printer.print(letter);
		
	}
}
public class NeedOfSyncInJAVA5 {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Client1 client1 = new Client1(printer, "i love java");
		Client1 client2 = new Client1(printer, "#$%%#@");
		Client1 client3 = new Client1(printer, "i love python");
		
	}
}
