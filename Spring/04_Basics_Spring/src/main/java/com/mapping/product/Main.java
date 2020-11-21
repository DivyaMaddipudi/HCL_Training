package com.mapping.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mappingProducts.xml");
		Cart cart = ctx.getBean("cart", Cart.class);
		cart.print();
		
		
	}

}
