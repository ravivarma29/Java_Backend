package com.sets;

import java.util.Objects;

public class User {

	private int UserId;
	
	private String name;

	public User(int userId, String name) {
		super();
		UserId = userId;
		this.name = name;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(UserId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return UserId == other.UserId && Objects.equals(name, other.name);
	}
	
	
	
}
