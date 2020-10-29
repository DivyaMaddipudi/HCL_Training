package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int id;
	private String name;
	private double salary;
	private transient String tempPassword;
	static String companyName = "HCL";
	
	public Employee() {
		System.out.println("default const");
	}
	
	public Employee(int id, String name, double salary) {
		System.out.println("param const");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String getTempPassword() {
		return tempPassword;
	}

	public void setTempPassword(String tempPassword) {
		this.tempPassword = tempPassword;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}
