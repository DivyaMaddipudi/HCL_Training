package com.divya.MavenExample;

public class SlowApi {

	public String getData(String data) {
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
	
	}
		return data.toUpperCase();
	}

}
