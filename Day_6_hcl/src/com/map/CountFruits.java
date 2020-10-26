package com.map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CountFruits {

	public static void main(String[] args) {
		Map<String, Integer> hMap = new HashMap<String, Integer>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("fruits.txt"));

			String line = null;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split("=");
				for (int i = 1; i < tokens.length; i=i+2) {
					if(hMap.containsKey(tokens[i-1])) {
						int sum = hMap.get(tokens[i-1]) + Integer.parseInt(tokens[i]);
						hMap.put(tokens[i-1], sum);
					} else {
						hMap.put(tokens[i-1], Integer.parseInt(tokens[i]));
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<Entry<String, Integer>> entrySet1 = hMap.entrySet();
		for(Entry<String, Integer> word : entrySet1) {
			System.out.println(word.getKey() + " = " + word.getValue());
		}
	}
}
