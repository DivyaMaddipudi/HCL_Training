package com.jaxb.ex2;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshall {
	
	public static void main(String[] args) {
		
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Library.class);
			Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
			Library library = (Library) unMarshaller.unmarshal(new File("marshal.xml"));
			
			System.out.println(library.getLibName());
			System.out.println(library.getLibLocation());
			System.out.println(library.getIsCentralAc());
			List<Books> books = library.getBooksList();
			books.forEach(b->System.out.println(b));
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
