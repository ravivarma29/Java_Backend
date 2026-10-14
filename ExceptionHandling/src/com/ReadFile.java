package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file =new File("D:/ Apps/Hi.txt");
		FileInputStream fis = new FileInputStream(file);
		System.out.println("File opened");
		
	}

}
