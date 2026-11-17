package com.arfoods.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="persons")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int personId;
	
	
	@Column(unique=true)
	private String userName;
	
	private String passWord;

	public Person(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	
	

}
