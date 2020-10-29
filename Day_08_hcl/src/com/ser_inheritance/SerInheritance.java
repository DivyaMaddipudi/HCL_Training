package com.ser_inheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	int i;
	A() {
		System.out.println("ctr of class A");
	}
	A(int i) {
		this.i = i;
	}
}

class B extends A{
	int j;
	B() {
		System.out.println("ctr of class A");
	}
	B(int i, int j) {
		super(i);
		this.j = j;
	}
}

public class SerInheritance {
	public static void main(String[] args) throws ClassNotFoundException {
		B b = new B(1, 2);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demoserinh.ser"));
			oos.writeObject(oos);
			System.out.println("done!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//de-ser
//		try {
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demoserinh.ser"));
//			B b2 = (B) ois.readObject();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
