package com.init_block;

import java.math.BigDecimal;
import java.util.Random;


class A {
	
	{
		System.out.println("init block");
	}
	
	
}
public class DemoOnStaticBlock {
	
	
    public static void main(String args[]) 
    {    
    	A a = new A();

    } 
 
}
