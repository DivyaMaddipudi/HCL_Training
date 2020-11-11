package com.jaxb.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainMarshall {
	public static void main(String[] args) {
		
		Library library = new Library("central lib", "banglore", true);
		library.addBook(new Books(1, "java", 1000, 2));
		library.addBook(new Books(2, "python", 5000, 3));
		library.addBook(new Books(3, "cpp", 2000, 1));
		library.addBook(new Books(4, "spring", 3000, 6));
		
		 
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Library.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			File file = new File("marshal.xml");
			marshaller.marshal(library, new FileOutputStream(file));
		} catch (JAXBException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
