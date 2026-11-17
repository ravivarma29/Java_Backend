package com.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	private int orderId;
	
	@Column(nullable=false)
	private double price;
	
	
	private int numberOfItems;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_Id")
	private User user;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public Order(int orderId, double price, int numberOfItems) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.numberOfItems = numberOfItems;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", price=" + price + ", numberOfItems=" + numberOfItems + ", user=" + user
				+ "]";
	}

	public Order(int orderId, double price, int numberOfItems, User user) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.numberOfItems = numberOfItems;
		this.user = user;
	}

	public Order(double price, int numberOfItems, User user) {
		super();
		this.price = price;
		this.numberOfItems = numberOfItems;
		this.user = user;
	}

	public Order() {
		super();
	}

	public Order(double price, int numberOfItems) {
		super();
		this.price = price;
		this.numberOfItems = numberOfItems;
	}
	
	

}
