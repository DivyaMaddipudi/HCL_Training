package com.empapp;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDaoImpl implements EmpDao {

	private Map<Integer, Emp> emps;
	private int counter = 0;
	
	
	public EmpDaoImpl() {
		emps = new HashMap<Integer, Emp>();
		emps.put(++counter, new Emp(counter, "divya", 500));
		emps.put(++counter, new Emp(counter, "riya", 20000));
	}
	
	public List<Emp> getAllEmployees() {
		List<Emp> emp = new ArrayList<Emp>(emps.values());
		return emp;
	}

	public int addEmp(Emp emp) {
		emp.setId(++counter);
		emps.put(counter, emp);
		
		return counter;
	}

	public Emp findById(int id) {
		Emp emp = emps.get(id);
		
		if(emp == null) 
			throw new EmpNotFoundExcp("emp with " + id + " not found ");
		return emp;
	}

	public Emp updateEmp(int id, double increment) {
		Emp emp = findById(id);
		emp.setSalary(emp.getSalary() + increment);
		return findById(id);
	}

}
