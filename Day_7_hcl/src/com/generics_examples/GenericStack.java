package com.generics_examples;

import java.util.Arrays;

class StackFullException extends RuntimeException {
	public StackFullException(String message) {
		super(message);
	}
}

class StackEmptyException extends RuntimeException {
	public StackEmptyException(String message) {
		super(message);
	}
}

class Stack<T> {
	private T x[];
	private final int SIZE;
	private int top;
	
	public Stack() {
		SIZE = 5;
//		x = new int[SIZE];
		x = (T[]) new Object[SIZE];
		top = -1;
	}
	
	public void push(T data) {
		if(stackFull()) {
			throw new StackFullException("stack full");
		}
		x[++top] = data;
	}
	
	public T pop() {
		if(stackEmpty()) {
			throw new StackEmptyException("Stack empty");
		}
		T data = x[top];
		top--;
		return data;
	}
	

	private boolean stackEmpty() {
		return top == -1;	
	}

	private boolean stackFull() {
		return top ==  SIZE -1;
	}

	@Override
	public String toString() {
		return "Stack [x=" + Arrays.toString(x) + ", SIZE=" + SIZE + ", top=" + top + "]";
	}
	
	
 }
public class GenericStack {
	
	public static void main(String[] args) {
		
//		Stack stack = new Stack();
	
//		Stack<Double> stack = new Stack();
//		stack.push(1.0);
//		stack.push(2.0);
//		stack.push(3.0);
//		stack.push(4.0);
//		stack.push(5.0);
//		System.out.println(stack.pop());
		
		
		Stack<Students> stack = new Stack();
		stack.push(new Students(1, "divya", 89));
		stack.push(new Students(1, "divya", 89));
		stack.push(new Students(1, "divya", 89));
		stack.push(new Students(1, "divya", 89));
//		stack.toString();
		
		
		//System.out.println(stack.pop());
		
	}

}
