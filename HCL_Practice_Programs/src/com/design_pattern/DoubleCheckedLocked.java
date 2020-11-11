package com.design_pattern;

public class DoubleCheckedLocked {
	
	//easiest way 
	private static DoubleCheckedLocked instance;
	private DoubleCheckedLocked() {}
	
	
	public static DoubleCheckedLocked getInstance() {
		
		if(instance == null) {
			
			synchronized (DoubleCheckedLocked.class) {
				if(instance == null) {
					instance = new DoubleCheckedLocked();
				}
			}
			
		}
		return instance;
	}

}
