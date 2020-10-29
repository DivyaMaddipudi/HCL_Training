package com.io;

import java.io.*;

public class DemoOnFiles2 {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("demo.txt");
			FileWriter fw = new FileWriter("demo1.txt");
			
			int i = 0;
			while((i=fr.read()) != -1) {
				fw.write(i);
			}
			fw.flush();
			fr.close();
			fw.close();
			System.out.println("copied....!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
