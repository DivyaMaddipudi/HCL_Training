package com.employee.model;

import java.util.Date;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private Date doj;
	private double salary;
	public Employee() {
		
	}
	public Employee(int id, String name, String department, Date doj, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.doj = doj;
		this.salary = salary;
	}
	public Employee(String name, String department, Date doj, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.doj = doj;
		this.salary = salary;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
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
		builder.append(", department=");
		builder.append(department);
		builder.append(", doj=");
		builder.append(doj);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
}
