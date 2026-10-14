package com.builderbuffer;

public class BuilderAndBuffer {
	 public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Ravi");
		sb.append("Varma" );
		System.out.println(sb);
		
		sb.insert(4, ",");
		System.out.println(sb);
		
		
		System.out.println(sb.length());
		
		sb.replace(4,10 ,"Akula");
		System.out.println(sb);
		
		
		
	}

}
