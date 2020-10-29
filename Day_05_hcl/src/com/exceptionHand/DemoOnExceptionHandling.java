package com.exceptionHand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoOnExceptionHandling  {
	
	public static void main(String[] args){
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		try {
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a/b;
		System.out.println(c);
		System.out.println("hello");
		} catch (ArithmeticException ex) {
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
			//System.out.println("dont divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("only ints");
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		} finally {
			System.out.println("clean up code");
			sc.close();
		}
		
		System.out.println("done");
	}
}
