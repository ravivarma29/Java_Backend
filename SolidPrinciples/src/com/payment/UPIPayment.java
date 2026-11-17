package com.payment;

public class UPIPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("payment Successful");
	}

}
