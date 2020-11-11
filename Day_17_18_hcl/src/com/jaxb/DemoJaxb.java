package com.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class DemoJaxb {
	
	public static void main(String[] args) {
		
		Emp emp = new Emp(121, "Divya", 500000);
		
		//i want to cconvert this java ----> xml
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Emp.class);
			Marshaller marsheller = jaxbContext.createMarshaller();
			marsheller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marsheller.marshal(emp, System.out);
			
			File file = new File("emp.xml");
			marsheller.marshal(emp, new FileOutputStream(file));
		
		} catch (JAXBException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
