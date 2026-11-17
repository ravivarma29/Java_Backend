package com.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsPrograms {
	public static void main(String[] args) {
		
		Map<Integer, User> userInfo = new HashMap<Integer, User>();
		
		User user1 = new User(1, "Ravi",789654,"HDFC123");
		User user2 = new User(2, "Varma",954654,"IDFC784");
		User user3 = new User(3, "Pavan",457896,"SBI7854");
		User user4 = new User(4, "Akhhil",954816,"ICICI123");
		User user5 = new User(4, "Akhhil",954816,"ICICI123");
		
		userInfo.put(1,user1);
		userInfo.put(2, user2);
		userInfo.put(3, user3);
		userInfo.put(4, user4);
		userInfo.put(5, user5);
		
//		System.out.println(userInfo.get(1));
//		System.out.println(userInfo.get(2));
//		System.out.println(userInfo.get(3));
//		System.out.println(userInfo.get(4));
//		System.out.println(userInfo.get(5));  // we can't use for loop instead we can use for each loop
//		 
		// we can't use for loop because indexing don't follow 
		
		System.out.println("<========");
		for( Integer key : userInfo.keySet())  {
			System.out.println( key + " = "+ userInfo.get(key));
		}
		
		for(Map.Entry<Integer, User> entry : userInfo.entrySet()){
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("========>");
		
		Iterator<Entry<Integer, User >> iterator = userInfo.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, User > entry = iterator.next();
			System.out.println(entry.getKey()+ " -> "+ entry.getValue());
		}
		
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Telugu", 78);
		marks.put("Hindi", 89);
		marks.put("English", 91);
		marks.put("Maths", 46);
		marks.put("Social", 91);
//		System.out.println("Hashmap " +marks);  If you want HAshmap
		
		Map<String, Integer> marks1 = new LinkedHashMap<String, Integer>();
		marks1.put("Telugu", 78);
		marks1.put("Hindi", 89);
		marks1.put("English", 91);
		marks1.put("Maths", 46);
		marks1.put("Social", 91);
//		System.out.println("LinkedHashMap "+marks1);  If you want LinkedHashhmap
		
		Map<String, Integer> marks2 = new TreeMap<String, Integer>();
		marks2.put("Telugu", 78);
		marks.put("Hindi", 89);
		marks2.put("English", 91);
		marks2.put("Maths", 46);
		marks2.put("Social", 91);
//		System.out.println("LinkedHashMap "+marks2);   If you want Treemap
	}

	private static void rawMap() 
{
		Map map = new HashMap();
		map.put(1, "Ravi");
		map.put(2, "School");
		map.put(true, 1);
		map.put('A', 67);
		map.put(null, "Byee");
		map.put(null, null);
		System.out.println(map);
	}
	
	
}
