package com.annotation;

import java.util.ArrayList;
import java.util.List;

class Foo {
	
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void usingCollection() {
		List list = new ArrayList();
		list.add(10);
	}
	
	@Deprecated
	public void oldApi() {
		System.out.println("written ub 2005");
	}
	
	public void newApi() {
		System.out.println("written ub 2005");
	}
	
}

public class DemoAnnotations {
	
	public static void main(String[] args) {
		Foo f = new Foo();
		f.oldApi();
	}
	

}
