package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Aadhar {
	
	@Id
	private long aadharNumber;
	
	private String fatherName;
	
	@OneToOne(mappedBy = "aadhar")
	private Citizen citizen;
	
	
	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public Aadhar() {
		super();
	}



	@Override
	public String toString() {
		return "Aadhar [aadharNumber=" + aadharNumber + ", fatherName=" + fatherName + "]";
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Aadhar(long aadharNumber, String fatherName) {
		super();
		this.aadharNumber = aadharNumber;
		this.fatherName = fatherName;
	}

	
	
}
