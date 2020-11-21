package com.demo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle.xml");
		ctx.registerShutdownHook();
		Foo foo = ctx.getBean(Foo.class);
		System.out.println(foo);
		
	}

}
