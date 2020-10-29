package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DemoOnSerialization {

	public static void main(String[] args) {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));
			Employee emp = new Employee(101, "satyadivya", 20000.0);
			
			emp.setTempPassword("divya@1");
			System.out.println(Employee.getCompanyName());
			Employee.setCompanyName("HCL Tech");
			//Data + meta data
			System.out.println(emp);
			System.out.println(emp.getTempPassword());
			System.out.println(Employee.getCompanyName());
			
			oos.writeObject(emp);
			System.out.println("object written");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
