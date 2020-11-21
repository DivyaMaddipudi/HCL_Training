package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Person person = ctx.getBean("person", Person.class);
		person.travel();
//		System.out.println(person.hashCode());
//		System.out.println("original " + person.getVehicle().hashCode());
		
//		Person person1 = ctx.getBean("person", Person.class);
//		person1.travel();
//		System.out.println(person1.hashCode());
//		System.out.println("clonned " + person1.getVehicle().hashCode());
		
//		Person person = new Person();
////		person.setPersonName("divya");
//		person.setVehicle(new Bike(100));
//		person.travel();
				
	}

}
