package com.frequency;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacters {
	public static void main(String[] args) {
		
		

		String name = "ravivarma";
	
		//Using Maps
		Map<Character,Integer> result = new HashMap<>();
		
		for(int i=0;i<name.length();i++)
		{
			char temp = name.charAt(i);
			//temp as char , getordefault temp as key 
			result.put(temp, result.getOrDefault(temp, 0)+1);
			}
		System.out.println(result);	
}
	

//		basicMethod(name, result);

	private static void basicMethod(String name, Map<Character, Integer> result) {
		for(int i=0;i<name.length();i++)
		{
			char temp = name.charAt(i);
			if(result.get(temp)!=null) {
				Integer count =result.get(temp);
				result.put(temp,count+1);
			}
			else
			{
			result.put(temp, 1);
			}
		}
		System.out.println(result);
	}
	
	

}

