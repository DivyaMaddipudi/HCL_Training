package com.queue;

import java.util.*;

class Queue {
	
	private LinkedList<String> list;

	public Queue() {
		list = new LinkedList<String>();
	}
	
	public void addQueue(String data) {
		list.add(data);
	}
	public String removeQue() {
		return list.remove();
	}
}
public class DemoQueueFromLL {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
	}

}
