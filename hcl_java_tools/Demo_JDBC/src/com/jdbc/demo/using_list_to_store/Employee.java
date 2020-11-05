package com.jdbc.demo.using_list_to_store;

public class Employee {

	private int eid;
	private String ename; 
	private int salary;
	private int did_fk;
	
	public Employee() {
		
	}
	
	public Employee(int eid, String ename, int salary, int did_fk) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.did_fk = did_fk;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDid_fk() {
		return did_fk;
	}
	public void setDid_fk(int did_fk) {
		this.did_fk = did_fk;
	}
	
	
	
}
