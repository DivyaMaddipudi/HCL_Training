package com.function_interface;

import java.util.function.Supplier;

class EmployeeNotFoundEx extends RuntimeException {
	
}
public class DemoSupplierFI {
	
	public static void main(String[] args) {
		
		Supplier<EmployeeNotFoundEx> exSupplier = () -> new EmployeeNotFoundEx();
		System.out.println(exSupplier.get());
		
		Supplier<Emp> empSupplier = () -> new Emp(1, "divya", 20000, "CSE");
		System.out.println(empSupplier.get());
		
		
		
//		Supplier<String> supplier = () ->  "hello to java 8";
//		String val = supplier.get();
//		System.out.println(val);
	}

}
