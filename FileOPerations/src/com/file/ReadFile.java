package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {

	//createFile();
	
	File file = new File("D:\\Apps/Hello.txt");
	FileInputStream fis= null; 
	try {
		fis= new FileInputStream(file);
		//fis.read();
		int temp;
		while((temp=fis.read())!= -1) // assigned value to temp(not to miss any byte and adding -1 such that it should read all characters
		{
			System.out.print((char)temp); // type casting bcoz it is string
		
		}
	   }

	catch(FileNotFoundException e)
	{
		System.out.println(e);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	
}	

	private static void createFile() {
		File file= new File("D:\\Apps/Hello.txt");
		try
		{
			file.createNewFile();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
