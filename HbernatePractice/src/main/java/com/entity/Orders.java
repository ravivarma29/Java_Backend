package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@Column(name ="orderId")
	private int orderId;
	
	@Column(name ="countofItems")
	private int countofItems;
	
	@Column(name="price")
	private int  price;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCountofItems() {
		return countofItems;
	}

	public void setCountofItems(int countofItems) {
		this.countofItems = countofItems;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", countofItems=" + countofItems + ", price=" + price + "]";
	}

	public Orders(int orderId, int countofItems, int price) {
		super();
		this.orderId = orderId;
		this.countofItems = countofItems;
		this.price = price;
	}
	
	

}
