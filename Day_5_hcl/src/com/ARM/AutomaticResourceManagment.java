package com.ARM;

import java.util.Scanner;

public class AutomaticResourceManagment {
	public static void main(String[] args) {
		//Java 7: ARM: its says that i(jvm) will clse the resource
		//u (programmer) dont worry but just use this new syntax

		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("PE a string");
			String name = scanner.next();
			System.out.println(name);
		}
	}

}
