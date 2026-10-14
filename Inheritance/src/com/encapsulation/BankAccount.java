package com.encapsulation;

public class BankAccount {
	public int accountNumber;
	public double balance;
	private int secretPin;
	//Getters and Setters

		public int getAccountNumner()
		{
			return accountNumber;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setAccountNumber(int accountNumber) 
		{
		this.accountNumber=accountNumber;
		}
		public void setBalance(double balance)
		{
			if(balance>0)
			{
			this.balance=balance;
			}
			else {
				System.out.println("Invalid Balance Passed");
			}
		}
		public double getBalance(int secretPin)
		{
		if(secretPin==this.secretPin)	{
			return balance;
		}
		else {
			System.out.println("Incorrect  Pin");
		}
		return 0;
		}

		public int getSecretPin() {
			return secretPin;
		}

		public void setSecretPin(int secretPin) {
			this.secretPin = secretPin;
		}

		
}