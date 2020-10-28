package com.io;

import java.io.File;
import java.io.FileFilter;

public class DemoOnFiles {
	
	public static void main(String[] args) {
		
		File dir = new File("E:\\HCL Training");
		if(dir.isDirectory()) {
			File[] files = dir.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File file) {
					return file.isHidden();
				}
			});
			for(File file: files) {
				System.out.println(file);
			}
		}
	}
}
