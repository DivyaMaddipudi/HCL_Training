package com.constructor_arg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("constructor_arg.xml");
		Foo foo = ctx.getBean("foo", Foo.class);
	}

}
