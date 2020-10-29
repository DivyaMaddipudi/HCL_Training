package com.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

public class FrequencyOfWordsInFile {
	public static void main(String[] args) {
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		try {
//			BufferedReader br = new BufferedReader(new FileReader("E:\\HCL Training\\error_archive.txt"));
			BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
			String line = null;
			while((line = br.readLine()) != null) {
				String[] tokens = line.split(" "); 
				for(String token : tokens) {
					if(hMap.containsKey(token)) {
							int value = hMap.get(token);
							hMap.put(token, value + 1);
						
					} else {
						hMap.put(token, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<Entry<String, Integer>> entrySet1 = hMap.entrySet();
		for(Entry<String, Integer> word : entrySet1) {
			System.out.println(word.getKey() + " = " + word.getValue());
		}
	}
}
