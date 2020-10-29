package com.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DemoOnProperties {
	
	public static void main(String[] args) {
		Properties pro = new Properties();
		try {
			InputStream is = new FileInputStream("info.properties");
			pro.load(is);
			System.out.println(pro.getProperty("name"));
			System.out.println(pro.getProperty("address"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
