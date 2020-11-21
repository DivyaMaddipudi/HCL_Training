package com.mapping.properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.mapping.product.Cart;

public class Main {
	
	public static void main(String[] args) {
		
//		Resource resource = new ClassPathResource("mappingProducts.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		Country country = (Country) beanFactory.getBean("country");
//		country.printCountryDetails();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("mappingProducts.xml");
		Country country = ctx.getBean("country", Country.class);
		country.printCountryDetails();
		
	}

}
