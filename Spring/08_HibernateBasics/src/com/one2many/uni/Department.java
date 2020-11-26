package com.one2many.uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept_table_one2many_uni")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	
	@JoinColumn(name = "did_fk")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Employee> employees = new ArrayList<Employee>();

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department(String deptName, List<Employee> employees) {
		super();
		this.deptName = deptName;
		this.employees = employees;
	}

	public Department() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [deptId=");
		builder.append(deptId);
		builder.append(", deptName=");
		builder.append(deptName);
		builder.append(", employees=");
		builder.append(employees);
		builder.append("]");
		return builder.toString();
	}
	
	
}
