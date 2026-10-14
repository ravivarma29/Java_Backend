package com.maps;

public class User {
	private int userId;
	
	private String name;
	
	private long accountNumber;
	
	private String ifscCode;

	public User(int userId, String name, long accountNumber, String ifscCode) {
		super();
		this.userId = userId;
		this.name = name;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
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

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + "]";
	}
	
	
	

}
