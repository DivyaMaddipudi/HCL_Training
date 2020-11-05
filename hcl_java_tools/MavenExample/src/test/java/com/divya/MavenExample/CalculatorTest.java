package com.divya.MavenExample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	Calculator cal;
	
	@Before
	public void setUp() throws Exception {
		 cal = new Calculator();
	}
	
	@Test
	public void testAdd() {
		Assert.assertEquals(4, cal.add(2, 2));
	}
	
	@Test
	public void testMul() {
		Assert.assertEquals(16, cal.mul(8, 2));
	}
	
	@Test
	public void testDiv() {
		Assert.assertEquals(4, cal.divide(8, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivByZero() {
		Assert.assertEquals(4, cal.divide(8, 0));
	}
	
	@After
	public void tearDown() throws Exception {
		cal = null;
	}
	

}
