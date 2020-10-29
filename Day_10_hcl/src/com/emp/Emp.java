package com.emp;


class EmpUtil {
	public static boolean isLowSalried(Emp emp) {
		return emp.getSalary()<10000;
	}
}
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

