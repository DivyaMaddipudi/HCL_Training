package com.design_pattern;

import javax.management.RuntimeErrorException;

public class EagerInitialization {
	
	
	private static final EagerInitialization eagerInstance;

	private EagerInitialization() {}
	
	// global accesss point for outer world to get the instance of the class
	
	static {
		try {
			eagerInstance = new EagerInitialization();
		}catch (Exception e) {
			throw new RuntimeException("Exception occured");
		}
	}
	
	public static EagerInitialization getInstance() {
		return eagerInstance; 
		
	}

}
