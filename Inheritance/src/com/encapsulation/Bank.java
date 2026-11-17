package com.encapsulation;

public class Bank {
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		myAccount.setAccountNumber(12456);
		myAccount.setBalance(100245.125);
		myAccount.setSecretPin(5462);	
		
		System.out.println(myAccount.getBalance(5461));
	}
}
