package lab_assignment_4.q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tester1 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			String line = null;
			while((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				for(String token: tokens) {
					System.out.println(token);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
