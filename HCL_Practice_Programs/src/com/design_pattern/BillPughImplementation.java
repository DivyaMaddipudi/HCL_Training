package com.design_pattern;

public class BillPughImplementation {
	
	private BillPughImplementation() {}
	
	private static class SingletonHelper {
		private static final BillPughImplementation instance = new BillPughImplementation();
	}
	
	
	public static BillPughImplementation getInstance() {
		return SingletonHelper.instance;
	}
}
