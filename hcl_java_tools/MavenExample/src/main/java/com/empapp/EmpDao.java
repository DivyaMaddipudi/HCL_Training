package com.empapp;

import java.util.List;

public interface EmpDao {
	
	public List<Emp> getAllEmployees();
	public int addEmp(Emp emp);
	public Emp findById(int id);
	public Emp updateEmp(int id, double increment);

}
