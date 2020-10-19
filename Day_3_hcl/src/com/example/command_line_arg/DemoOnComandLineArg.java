package com.example.command_line_arg;

public class DemoOnComandLineArg {
	
	public static void main(String[] args) {
		//to echo the name whic i pass as command line arg
		int sum = 0;
		for(String temp: args) {
			sum += Integer.parseInt(temp);
		}
		System.out.println("sum is: " +sum);
	}

}
