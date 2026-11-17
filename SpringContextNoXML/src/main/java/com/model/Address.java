package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("${street}")
	private String street;
	
	@Value("${zipcode}")
	private String zipcode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Address() {
		super();
	}

	public Address(String street, String zipcode) {
		super();
		this.street = street;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode + "]";
	}
	
	

}
