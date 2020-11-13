package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class CounterDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		
		ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("foo.ser"));
		oos.writeObject(0);
		System.out.println("done");
	}

}
