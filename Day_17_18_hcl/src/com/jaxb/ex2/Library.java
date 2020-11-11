package com.jaxb.ex2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="library", namespace = "https://www.hcltech.com/")
@XmlAccessorType(XmlAccessType.FIELD)
public class Library {
	
	@XmlElement(required = true)
	private String libName;
	private String libLocation;
	private boolean centralAc;	
	
	@XmlElementWrapper(name="books")
	@XmlElement(name="book")
	private List<Books> booksList = new ArrayList<>();
	
	
	public Library() {
		super();
	}
	
	
	public Library(String libName, String libLocation, boolean centralAc) {
		super();
		this.libName = libName;
		this.libLocation = libLocation;
		this.centralAc = centralAc;
	}


	public Library(String libName, String libLocation, boolean centralAc, List<Books> booksList) {
		super();
		this.libName = libName;
		this.libLocation = libLocation;
		this.centralAc = centralAc;
		this.booksList = booksList;
	}

	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public String getLibLocation() {
		return libLocation;
	}
	public void setLibLocation(String libLocation) {
		this.libLocation = libLocation;
	}
	public boolean getIsCentralAc() {
		return centralAc;
	}
	public void setCentralAc(boolean centralAc) {
		this.centralAc = centralAc;
	}
	public List<Books> getBooksList() {
		return booksList;
	}
	public void addBook(Books book) {
		booksList.add(book);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Library [libName=");
		builder.append(libName);
		builder.append(", libLocation=");
		builder.append(libLocation);
		builder.append(", centralAc=");
		builder.append(centralAc);
		builder.append(", booksList=");
		builder.append(booksList);
		builder.append("]");
		return builder.toString();
	}
}
