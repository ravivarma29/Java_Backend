package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="citizens")
public class Citizen {
	@Id
	@Column(name ="citizen_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int citizenID;
	
	
	@Column
	private String name;
	
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="aadhar_id")
	private  Aadhar aadhar;

	
	
	public Citizen() {
		super();
	}

	public Citizen(int citizenID, String name, int age, Aadhar aadhar) {
		super();
		this.citizenID = citizenID;
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}

	public Citizen(String name, int age, Aadhar aadhar) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Citizen [citizenID=" + citizenID + ", name=" + name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}


	


	
	
	

}
