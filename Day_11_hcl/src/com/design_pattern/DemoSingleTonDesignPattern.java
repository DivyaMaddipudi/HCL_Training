package com.design_pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable{
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	public static Singleton getSingleton() {
		return singleton;
	}
	
	//this is special method : i expect java to call this whenever somebody
	private Object readResolve() {
		return this;
	}
}
public class DemoSingleTonDesignPattern {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton singleton = Singleton.getSingleton();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("data.ser")));
		oos.writeObject(singleton);
		
		//de -ser
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("data.ser")));
//		Singleton singleton2 = ois.readObject(singleton);
		
		System.out.println(singleton.hashCode());
		System.out.println(singleton.hashCode());
		
	}
}
