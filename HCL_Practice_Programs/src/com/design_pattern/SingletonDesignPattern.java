package com.design_pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable, Cloneable{
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	private Object readResolve() {
		return singleton;
	}
	
	
}

public class SingletonDesignPattern {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		
		
		Object obj = new Object();
	    synchronized (obj){
	        System.out.println("before null");
	        obj =null;
	        System.out.println("after null");
	    }
	    System.out.println("successfully Exited");

//		Singleton singleton = Singleton.getSingleton();
//		
//		//ser
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("single.ser")));
//		oos.writeObject(singleton);
//		
//		System.out.println("single hashcode: " +singleton.hashCode());
//		
//		//de-ser
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("single.ser")));
//		Singleton singletonDeSerObj = (Singleton)ois.readObject(); 
//		
//		System.out.println("deser obj hashcode: " + singletonDeSerObj.hashCode());
//		
//		Singleton cloneSingleton = (Singleton) singleton.clone();
//		System.out.println("clone hascode:" + cloneSingleton.hashCode());
		
		
	}

}
