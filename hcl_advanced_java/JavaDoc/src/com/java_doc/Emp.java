package com.java_doc;

/**
 * @author divya
 * @since 03-11-2020
 * @apiNote Emp class used as DTO in api
 *
 */

public class Emp {
	
	private int id;
	private String name;
	private double salary;
	
	protected void foo() {
		
	}
	
	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
