package com.employee.model;

import java.util.List;

public interface EmployeeDao {
	
	public Employee addEmployee(Employee employee);
	public Employee deleteEmployee(int id);
	public List<Employee> getAllEmployees();
	public Employee updateEmployee(int id, Employee employee);

}
