package com.day2.stack;

public class Stack {
	
	private final int SIZE;
	private int x[];
	private int top;
	
	public Stack() {
		SIZE = 5;
		x = new int[SIZE];
		top = -1; // stack is empty
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full");
		} else {
			x[++top] = data;
		}
	}
	
	public int pop() {
		int value = -999;
		if(isEmpty()) {
			System.out.println("Empty");
		} else {
			value = x[top--];
		}
		return value;
	}
	
	public int peek() {
		int value = -999;
		if(isEmpty()) {
			System.out.println("Empty");
		} else
			value = x[top];
		return value;
	}

	private boolean isEmpty() {
		
		return (top==-1)?true:false;
	}

	private boolean isFull() {	
		return (top== SIZE -1) ? true:false;
	}
}