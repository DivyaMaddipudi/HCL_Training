package com.ser_composition;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class M implements Serializable{
	
	int m = 3;
}

class N implements Serializable{
	int n = 4;
	String name = "raj";
	Integer marks = 99;
	
	transient M mObj = new M();
	
	public void print() {
		System.out.println("n: " + n);
		System.out.println("m: " + mObj.m);
	}
}
public class DemoSerComposition implements Serializable{
	
	public static void main(String[] args) {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser_comp.ser"));
			N n = new N();
			oos.writeObject(n);
			n.print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ser_comp.ser"));
				N nvalue = (N) ois.readObject();
				nvalue.print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
