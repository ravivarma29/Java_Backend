package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	public static void main(String[] args) throws IOException {
//		Scanner sc=null;
//    writeFile();
//		writeFromOneFileToAnother();
//		 writeFromOneImageToAnother();
//		File file2 = new File("D:\\Apps/decor2.jpg");
//		file2.delete(); // it will delete
		 
		 File file2 = new File("D:\\Apps/Write2.txt");
			
		 FileWriter fileWriter = new FileWriter(file2);
		 fileWriter.write("This is new File called Write");
		 fileWriter.close();

}
	
	public static void writeFromOneImageToAnother()
	{
	File file = new File("D:\\Apps/decor.jpg");
	File file2 = new File("D:\\Apps/decor2.jpg");
	FileInputStream fis = null;
	FileOutputStream fos=null;
	try {
		fis = new FileInputStream(file);	
		fos = new FileOutputStream(file2);
		int temp;
		while((temp = fis.read())!= -1)
{
	fos.write(temp);
	
}
		
	}
	catch(FileNotFoundException e){
		System.out.println(e);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	finally {
		System.out.println("Image is copied");
	}
	}
	
	
	public static void writeFromOneFileToAnother()
	{
	File file = new File("D:\\Apps/Write.txt");
	File file2 = new File("D:\\Apps/Write2.txt");
	FileInputStream fis = null;
	FileOutputStream fos=null;
	try {
		fis = new FileInputStream(file);
		fos = new FileOutputStream(file2);
		int temp;
		while((temp = fis.read())!= -1)
{
	fos.write(temp);
}
		
	}
	catch(FileNotFoundException e){
		System.out.println(e);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
	
	public static void writeFile()
	{
	File file = new File("D:\\Apps/Write.txt");
	String temp="Welcome to Java Class";
	FileOutputStream fos=null;
	try {
		fos = new FileOutputStream(file);
		//fos.write(temp.getBytes()); for valid sentence below line is extracted
		final byte [] bytes= temp.getBytes();
		fos.write(bytes);		
	}
	catch(FileNotFoundException e){
		System.out.println(e);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
}
