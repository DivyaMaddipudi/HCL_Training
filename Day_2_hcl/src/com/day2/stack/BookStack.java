package com.day2.stack;

public class BookStack {
	
	private final int SIZE;
	private Book x[];
	private int top;
	
	public BookStack() {
		SIZE = 5;
		x = new Book[SIZE];
		top = -1; // stack is empty
	}
	
	public void push(Book data) {
		if(isFull()) {
			System.out.println("Stack is full");
		} else {
			x[++top] = data;
		}
	}
	
	public Book pop() {
		Book value = new Book(-999, "");
		if(isEmpty()) {
			System.out.println("Empty");
		} else {
			value = x[top];
			x[top] = null;
			top--;
		}
		return value;
	}
	
	public Book peek() {
		Book value = new Book(-999, "");
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
	
	public void printBooks() {
		for(int i=0;i<SIZE;i++) {
			System.out.println(x[i].printBooks());
		}
	}
}
