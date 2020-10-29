package com.function_interface;

class EmpData {
	
	private String name;
	private double salary;
	
	
	public EmpData() {}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmpData [name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}


	public EmpData(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
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
	
	

}