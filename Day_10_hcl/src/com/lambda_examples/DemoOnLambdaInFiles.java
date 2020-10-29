package com.lambda_examples;

import java.io.File;

public class DemoOnLambdaInFiles {
	
	public static void main(String[] args) {
		
		File dir = new File("E:\\HCL Training");
		if(dir.isDirectory()) {
			File[] files = dir.listFiles((fileName) ->fileName.isHidden());
			
			for(File file: files) {
				System.out.println(file);
			}
		}
	}
}
