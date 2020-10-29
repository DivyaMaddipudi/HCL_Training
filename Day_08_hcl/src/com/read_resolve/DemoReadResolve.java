package com.read_resolve;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyDemo implements Serializable{
	private int i;

	public MyDemo(int i) {
		super();
		this.i = i;
	}
	
	public void print() {
		System.out.println(i);
	}
	
	
	
	public Object readResolve() {
		System.out.println("hey java call it but dont do der-ser");
		return this;
	}
	
}
public class DemoReadResolve {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		MyDemo myDemo = new MyDemo(22);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("resolver.ser"));
		System.out.println(myDemo.hashCode());
		oos.writeObject(myDemo);
		System.out.println("done!!");
		
		//de- ser
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("resolver.ser"));
		
		MyDemo myDemo1 = (MyDemo) ois.readObject();
		System.out.println(myDemo1.hashCode());
		System.out.println("done de-ser");
		
		if(myDemo.equals(myDemo1)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
	}
}
