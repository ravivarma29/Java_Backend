package com.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add(45);
		s.add("Ravi");
		s.add(10.8);
		s.add('R');
		s.add(null);
		System.out.println(s);
		
		System.out.println("------>");
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(10);
		s2.add(12);
		s2.add(null);
		System.out.println(s2);
		System.out.println("<------");
		
		Set<Integer> s3 = new TreeSet<Integer>();
		s3.add(12);
		s3.add(47);
		s3.add(78);
		
		
		Set<String> s4 = new TreeSet<String>();
		s4.add("ABC");
		s4.add("BVD");
		s4.add("RAVI");
		s4.add("Abc");
		s4.add("ABB");
		
//		s3.add(null);    doesn't allow values
		System.out.println(s3);
		
		System.out.println("Users set ");
	User  user1 = new User(1 , "Ravi");
	User  user2 = new User(2 , "ABC");
	User  user3 = new User(2 , "ABC");
	User  user4 = new User(4 , "School");
	
	Set<User> users = new HashSet<User>();
	users.add(user1);
	users.add(user1);
	users.add(user3);
	users.add(user4);
	System.out.println(user2.hashCode());
	System.out.println(user3.hashCode());   // different hashcode for user2 and user3 , now we will over ride in user class
	
	System.out.println(users);
	
	System.out.println("Treeset");
	
//	Set<User> users2 = new TreeSet<User>();
//	users2.add(user1);
//	users2.add(user1);
//	users2.add(user3);
//	users2.add(user4);
//	
	
	// Tree set doesn't allow custom object
	// issue can be solved using comparator
//	System.out.println(users2);
	
	
	Set<Boolean> bools = new TreeSet<Boolean>();
	bools.add(false);
	bools.add(false);
	bools.add(true);
	System.out.println(bools);
	
	Set<String> s5 = new TreeSet<String>();
	s5.add("ABC");
	s5.add("BVD");
	s5.add("RAVI");
	s5.add("Abc");
	s5.add("ABB");
	
	for(String val :s5) {
		System.out.println(val);
	}
	System.out.println("--------Using Iterator------");
	Iterator<String> iterator  = s5.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	}

	
}
