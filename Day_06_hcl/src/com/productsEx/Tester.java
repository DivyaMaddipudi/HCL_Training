package com.productsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
	
	public static void main(String[] args) {
		
		List<Products> prodList = new ArrayList<Products>();
		
		prodList.add(new Products(101, "bag", 200.0, "general", 2));
		prodList.add(new Products(105, "laptop", 600.0, "electronics", 15));
		prodList.add(new Products(103, "mobile", 800.0, "electronics", 20));
		prodList.add(new Products(102, "java", 500.0, "book", 12));
		prodList.add(new Products(104, "ikigai", 300.0, "book", 5));
		
		//print
		printProdList(prodList);
		
		//SORT
		System.out.println("by id------------------------");
		Collections.sort(prodList);
		printProdList(prodList);
		
		//sort as per prod 
		System.out.println("by prod------------------------");
		Collections.sort(prodList, new ProductSorterAsPerName());
		printProdList(prodList);
		
		//SortAsPerCaategoryAndThenDiscount
		System.out.println("by category then dicsount------------------------");
		Collections.sort(prodList, new SortAsPerCaategoryAndThenDiscount());
		printProdList(prodList);
	}

	public static void printProdList(List<Products> prodList) {
		
		for(Products prod : prodList) {
			System.out.println(prod);
		}
	}
}
