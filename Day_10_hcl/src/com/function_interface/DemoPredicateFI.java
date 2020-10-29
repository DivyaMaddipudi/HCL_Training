package com.function_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Emp {
	private int i;
	private String name;
	private double salary;
	private String dept;
	
	public Emp() {}
	
	public Emp(int i, String name, double salary, String dept) {
		super();
		this.i = i;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [i=");
		builder.append(i);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", dept=");
		builder.append(dept);
		builder.append("]");
		return builder.toString();
	}
}

public class DemoPredicateFI {
	
	public static void main(String[] args) {
		
		BiPredicate<Emp, Emp> empBiPredicate = (Emp e1, Emp e2) -> e1.getName().equals(e2.getName());
		Emp emp1 = new Emp(2, "ria", 50000, "IT");
		Emp emp2 = new Emp(3, "riya", 5000, "HR");
		
		System.out.println(empBiPredicate.test(emp1, emp2));
		
		Predicate<Integer> isEven = n ->  n%2 == 0;
//		System.out.println(isEven.test(34));
		
		Predicate<Emp> empPredicate =  emp -> emp.getSalary() > 1000;
		Emp emp = new Emp(2, "ria", 50000, "IT");
//		System.out.println(empPredicate.test(emp));
		
	}

}
