package com.function_interface;

import java.util.function.BiFunction;
import java.util.function.Function;


public class DemoOnFunctionFI {
	
	public static void main(String[] args) {
		
		BiFunction<Emp, Emp, Double> biFunction = (Emp e1, Emp e2) -> e1.getSalary()+e2.getSalary();
		Emp emp1 = new Emp(2, "ria", 50000, "IT");
		Emp emp2 = new Emp(3, "riya", 5000, "HR");
		System.out.println(biFunction.apply(emp1, emp2));
		
		//i want to get name of person from Employee object
		
		//Emp ---> String
		
//		Function<Emp, String> function = (Emp emp) -> emp.getName();
//		Emp emp2 = new Emp(3, "riya", 5000, "HR");
		
//		Function<Emp, String> function2 = (emp) -> emp.getName().concat(emp.getDept());
//		Emp emp1 = new Emp(2, "ria", 50000, "IT");
//		System.out.println(function2.apply(emp1));
		
		
//		Function<Emp, EmpData> function3 = (Emp emp) -> new EmpData(emp.getName(), emp.getSalary());
//		Emp emp3 = new Emp(3, "riya", 5000, "HR");
//		EmpData data = function3.apply(emp3);
//		System.out.println(data);
		
		
	}

}
