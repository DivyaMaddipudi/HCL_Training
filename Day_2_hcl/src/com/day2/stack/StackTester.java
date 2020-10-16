package com.day2.stack;

import java.util.Scanner;

public class StackTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
//		System.out.println("Enter data");
//		for(int i=0;i<5;i++) {
//			int data = sc.nextInt();
//			stack.push(data);
//		}
		
		stack.push(32);
		stack.push(36);
		stack.push(40);
		stack.push(123);
		stack.push(161);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
	}

}
