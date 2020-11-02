package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;
	
	public CalculatorTest() {
		cal = new Calculator();
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("it run before every test case only once..");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("it run after every test case only once..");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("it run before every test case..");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("it run after every test case..");
	}

	@Test
	public void testAdd() {
		System.out.println("test true");
		Assert.assertEquals(30, cal.add(10, 20));
	}
	
	@Test
	public void testMul() {
		System.out.println("test true");
		Assert.assertEquals(200, cal.mul(10, 20));
	}
	
	@Test
	public void testFalseAdd() {
		System.out.println("test false");
		Assert.assertNotEquals(20, cal.add(10, 20));
	}
	
	@Test
	public void testFalseMul() {
		System.out.println("test false");
		Assert.assertNotEquals(20, cal.mul(10, 20));
	}
	
	@Test
	public void testTrueDiv() {
		System.out.println("test false");
		Assert.assertEquals(2, cal.divide(20, 10));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideWithException() {
		assertEquals(8, cal.divide(10, 0));
	}
}
