package com.read_resolve;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyDemo1 implements Serializable{
	
	public MyDemo1() {
		
	}
	
	private static class BillPughSingleton 
	  { 
	    private static final MyDemo1 INSTANCE = new MyDemo1(); 
	  } 
	  
	  public static MyDemo1 getInstance()  
	  { 
	    return BillPughSingleton.INSTANCE; 
	  } 
}

public class DemoOnSingleTonBillPughMethod {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		MyDemo1 myDemo = new MyDemo1();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("billpugh.ser"));
		System.out.println(myDemo.hashCode());
		oos.writeObject(myDemo);
		System.out.println("ser done!!");
		
		//de- ser
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("billpugh.ser"));
		
		MyDemo1 myDemo1 = (MyDemo1) ois.readObject();
		
		System.out.println(myDemo1.hashCode());
		System.out.println("done de-ser");
		
		if(myDemo == (myDemo1)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}

	

}
