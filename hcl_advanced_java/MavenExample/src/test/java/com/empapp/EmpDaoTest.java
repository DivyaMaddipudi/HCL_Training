package com.empapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class EmpDaoTest {

	private Emp emp;
	private EmpDao dao;

	@Before
	public void setUp() {
		dao = new EmpDaoImpl();
		emp = new Emp(12, "divya", 600);
	}

	@Test
	public void testGetAllEmp() {
		int noOfRec = dao.getAllEmployees().size();
		Assert.assertEquals(2, noOfRec);
	}

	@Test
	public void testGetByIdFound() {
		
		Emp emp = dao.findById(2);
		assertNotNull(emp);

	}
	
	@Test(expected = EmpNotFoundExcp.class)
	public void testGetByIdNotFound() {
		Emp emp = dao.findById(100);
		assertNotNull(emp);

	}
	
	@Test
	public void testAddNewEmp() {
		
		Emp emp = dao.findById(1);
		double sal = emp.getSalary();
		Emp update = dao.updateEmp(1, 20);
		
		
		
		assertEquals((double)(20), update.getSalary()-sal);

	}

	@After
	public void tearDown() {

	}

}
