package com.queue;
import java.util.*;

public class DemoOnPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Student> priorityQue = new PriorityQueue<>();
		priorityQue.add(new Student(1, "divya", 80));
		priorityQue.add(new Student(2, "satya", 89));
		priorityQue.add(new Student(3, "riya", 92));
		priorityQue.add(new Student(4, "veenai", 85));
		priorityQue.add(new Student(5, "ram", 79));
		
		Student student = priorityQue.peek();
		System.out.println("peek:" +student);
		
		while(!priorityQue.isEmpty()) {
			System.out.println(priorityQue.remove());
		}
		
	}

}
