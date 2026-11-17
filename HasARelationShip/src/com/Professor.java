package com;

public class Professor {
	
	 private String Name;
	
    private	int exp;

	@Override
	public String toString() {
		return "Professor [Name=" + Name + ", exp=" + exp + "]";
	}
	public Professor()
	{
		
	}
	

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public Professor(String name, int exp) {
		super();
		Name = name;
		this.exp = exp;
	}

	
}
