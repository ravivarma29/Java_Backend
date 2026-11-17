package com.encapsulation;

public class Bank {
	
	public int accountNumber;
	
	public double balance;
	
	public int secretPin;
	
	// Getters and Setter
	
	public int getaccountNumber()
	{
		return 0;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber= accountNumber;
	}
	
	public double getBalance()
	{
		return 0;
	}
	public void setBalance(double balance)
	{
		if (balance>0)
		{		
			this.balance=balance;
		}else
			System.out.println("unable to fetch Balance");
	}
	

}
