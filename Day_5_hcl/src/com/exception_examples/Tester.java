package com.exception_examples;

import java.io.IOError;
import java.io.IOException;

class A {
	void method() throws NullPointerException {
		System.out.println("base");
	}
}

class B extends A {
	void method() throws NullPointerException{
		System.out.println("sub class");
	}
}

public class Tester {

	public static void main(String[] args) throws AccountCreationException {

		try {
			Account account = new Account("divya", 7000);
			account.deposit(0);
			account.withDraw(2000);
			

		} catch (AccountCreationException e) {
			System.out.println(e.getMessage());

		} catch (NotSufficientFundException e) {

			System.out.println(e.getMessage());
		} catch (OverFundException e) {
			System.out.println(e.getMessage());
		}
	}
}
