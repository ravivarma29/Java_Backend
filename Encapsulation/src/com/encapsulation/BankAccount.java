package com.encapsulation;

public class BankAccount {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.setAccountNumber(45623);
		bank.setBalance(10000);
		
		System.out.println(bank.balance);
		
	}

}
