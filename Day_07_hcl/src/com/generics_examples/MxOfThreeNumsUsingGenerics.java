package com.generics_examples;

public class MxOfThreeNumsUsingGenerics {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 9;
		int c = 7;
		
		System.out.println(maxNumber(a, b, c));
	}

	private static <T extends Comparable<T>>T  maxNumber(T a, T b, T c) {
		T max = a;
		if(a.compareTo(b) < 0) {
			max = b;
		}
		if(max.compareTo(c) < 0) {
			max = c;
		}
		return max;
	}
}
