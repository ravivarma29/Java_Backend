package com.model;

import java.util.List;

public class User {
	

	int userId;
	
	String name;

	List<String> skills;
	
	Address address;
	
//	 Map(String, String) hobbies;
	
	public User() {
		super();
		}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", skills=" + skills + ", address=" + address + "]";
	}

	public List<String> getSkills() {
		return skills;
	}
	 	
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(int userId, String name, List<String> skills, Address address) {
		super();
		this.userId = userId;
		this.name = name;
		this.skills = skills;
		this.address = address;
	}



}
