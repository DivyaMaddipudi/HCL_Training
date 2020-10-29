package com.lambda_examples;


@FunctionalInterface
interface Example {
	public void add(int a, int b);
	
	public default void print() {
		System.out.println("Sum is printed");
	}
	
}
public class AddOnInterface {
	
	public static void main(String[] args) {
		
		Example ex = (int a, int b) -> {System.out.println(a+b);};
		ex.add(4, 6);
	
		}

}
