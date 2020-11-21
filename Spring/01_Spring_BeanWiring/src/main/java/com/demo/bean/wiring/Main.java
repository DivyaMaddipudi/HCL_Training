package com.demo.bean.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		
		//ClassPathXmlApplicationContext: Hey, spring config gile is xml and it is present in class path
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
		Caar car = (Caar) context.getBean("car");
		System.out.println("hash code of original car:" + car.hashCode());
		System.out.println("hash code of original engine:" + car.getEngine().hashCode());
		System.out.println("hash code of original tyre:" + car.getEngine().hashCode());
//		car.travel();
		
		//singleton
		Caar car1 = (Caar) context.getBean("car");
		System.out.println("hash code of clonned car:" + car1.hashCode());
		System.out.println("hash code of clonned engine:" + car1.getEngine().hashCode());
		System.out.println("hash code of clonned tyre:" + car1.getEngine().hashCode());
//		car1.travel();
		
		
//		MrfTyre tyre = new MrfTyre();
//		tyre.setPrice(4000);
//		
//		PowerEngine engine = new PowerEngine();
//		engine.setBrand("L and T");
//		engine.setHorsePower(4500);
//		
//		Caar car = new Caar();
//		car.setEngine(engine);
//		car.setTyre(tyre);
//		
//		car.travel();
	}

}
