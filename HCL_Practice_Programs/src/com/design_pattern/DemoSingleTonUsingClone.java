package com.design_pattern;


class SingleTonUsingClone implements Cloneable{
	
	private static SingleTonUsingClone instance = new SingleTonUsingClone();
	private SingleTonUsingClone() {}
	
	public static SingleTonUsingClone getInstance() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException("can not clone an object");
	}
	
}

public class DemoSingleTonUsingClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		SingleTonUsingClone singleton = SingleTonUsingClone.getInstance();
		System.out.println(singleton.hashCode());
		
		SingleTonUsingClone singleton2 = (SingleTonUsingClone) singleton.clone();
		System.out.println(singleton2.hashCode());
		
	}
	
}
