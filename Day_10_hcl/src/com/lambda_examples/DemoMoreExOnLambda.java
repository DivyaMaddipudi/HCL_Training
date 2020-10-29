package com.lambda_examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

public class DemoMoreExOnLambda {
	
	public static void main(String[] args) {
		
		List<Emp> emp = Arrays.asList(new Emp(1, "divya", 60000, "CSE"), 
									new Emp(2, "ria", 50000, "IT"),
									new Emp(3, "rajiv", 20000, "Marketing"),
									new Emp(4, "john", 3000, "Sports"),
									new Emp(5, "doe", 40000, "IT"));
		
		
		
//		Comparator<Emp> comparator = (Emp o1, Emp o2) -> Double.compare(o1.getSalary(), o2.getSalary());
//		Collections.sort(emp, comparator);
		
//		Collections.sort(emp, (Emp o1, Emp o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
			
		Collections.sort(emp, Comparator.comparing(Emp::getDept));

		for(Emp empVal : emp) {
			System.out.println(empVal);
		}
	
	}

}
