package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//this is a custom annotation.... just applying on a class/methodd it dont do anything
//u have to process using java reflection
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
	
	public String hello() default "hello to hcl";
	public boolean isDone() default false;

}
