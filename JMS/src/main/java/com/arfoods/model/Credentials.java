package com.arfoods.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="info.my")
public class Credentials {
	
	private String username;
	
	private String password;

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Credentials() {
		super();
	}

	@Override
	public String toString() {
		return "Credentials [username=" + username + ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
