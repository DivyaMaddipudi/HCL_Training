package com.demo.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Foo implements InitializingBean, DisposableBean{
	
	@Value(value = "foo value")
	private String fooValue;
	
	public Foo() {
		System.out.println("constr of foo");
	}

	public String getFooValue() {
		return fooValue;
	}

	public void setFooValue(String fooValue) {
		System.out.println("setters method");
		this.fooValue = fooValue;
	}
	
	
	public void xmlInit() {
		System.out.println("xml init is ccalled");
	}
	
	@PostConstruct
	public void annotationInit() {
		System.out.println("---------------------------------");
		System.out.println("AnnotationInit is called");
		System.out.println("---------------------------------");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("disposable bean set properties");
		
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("disposable destroy method");
	}

	public void xmlDestroy() {
		System.out.println("xml destroy");
	}
	

	@Override
	public String toString() {
		return "Foo [fooValue=" + fooValue + "]";
	}
	
	@PreDestroy
	public void annotationDestroy() {
		System.out.println("annotationDestroy is called");
		
	}
}
