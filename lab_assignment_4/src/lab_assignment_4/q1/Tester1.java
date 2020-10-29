package lab_assignment_4.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Tester1 {
	public static void main(String[] args) {
//		BufferedReader br = null;
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("data.txt");
//			 br = new BufferedReader(new FileReader("data.txt"));
			int line = 0;
			
			while((line = fis.read()) != -1) {
				System.out.print((char)line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
