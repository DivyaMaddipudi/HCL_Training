package com.design_pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingleTonSer implements Serializable{
	
	private static final SingleTonSer instance = new SingleTonSer();
	private SingleTonSer() {}
	
	public static SingleTonSer getInstance() {
		return instance;
	}
	
	private Object readResolve() {
		return instance;
		
	}
	
}

public class SerializationAndDeSerInSingleTon {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SingleTonSer singleton = SingleTonSer.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonImpl.ser"));
		oos.writeObject(singleton);
		System.out.println(singleton.hashCode() + " serialization");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singletonImpl.ser"));
		SingleTonSer singleton2 = (SingleTonSer)ois.readObject();
		System.out.println(singleton2.hashCode() + " deserialized");
		
	}
}
