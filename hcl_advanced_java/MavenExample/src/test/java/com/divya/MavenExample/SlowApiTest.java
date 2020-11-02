package com.divya.MavenExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SlowApiTest {
	
	private SlowApi slowApi;

	@Before
	public void beforeTest() {
		slowApi = new SlowApi();
	}
	
	@Test(timeout = 1000)
	public void testSlowApi() {
		String data = slowApi.getData("raj");
		assertEquals("RAJ", slowApi.getData(data));
	}

	@After
	public void afterTest() {
		slowApi = null;
	}
}
