package com.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int userId;
	
	private String name;
	
	@Column(unique=true)
	private long mobileNum;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Order> orders;

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

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", mobileNum=" + mobileNum +  "]";
	}

	public User(int userId, String name, long mobileNum, List<Order> orders) {
		super();
		this.userId = userId;
		this.name = name;
		this.mobileNum = mobileNum;
		this.orders = orders;
	}

	public User(String name, long mobileNum, List<Order> orders) {
		super();
		this.name = name;
		this.mobileNum = mobileNum;
		this.orders = orders;
	}

	public User() {
		super();
	}
	
	

}
