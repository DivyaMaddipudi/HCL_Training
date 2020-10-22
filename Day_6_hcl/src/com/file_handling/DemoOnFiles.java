package com.file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoOnFiles {
	
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
			String line = null;
			while((line = br.readLine()) !=null) {
				String tokens[] = line.split(" ");
				for(String token: tokens) {
					
					words.add(token);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		for(String word: words ) {
			System.out.println(word);
		}
	}
}
