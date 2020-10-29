package com.synchronization;


class Printer {
	
	private Object lock = new Object();
	//any java object can work as a lock
	//lock is taken on the obj not on the method
	
	//c1, c2, c3
	public void print(String letter) {
		
		synchronized (lock) {
			System.out.print("[");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(letter + "]");
		}
	}
}

class Client implements Runnable{
	private Printer1 printer;
	private Thread thread;
	private String letter;
	public Client(Printer1 printer, String letter) {
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
public class NeedForSynchronization {
	public static void main(String[] args) {
		Printer1 printer = new Printer1();
		Client client1 = new Client(printer, "i love java");
		Client client2 = new Client(printer, "#$%%#@");
		Client client3 = new Client(printer, "i love python");
		
	}
}
