package org.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathFunctionsTest {

	MathFunctions mathFunction;
	
	public MathFunctionsTest() {
		mathFunction = new MathFunctions();
	}
	
	@Test
	void testAdd() {
		int expected = 30;
		int actual = mathFunction.add(10, 20);
		assertNotEquals(expected, actual);
	}

}
