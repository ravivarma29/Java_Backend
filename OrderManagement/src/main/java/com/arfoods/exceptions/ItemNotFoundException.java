package com.arfoods.exceptions;

public class ItemNotFoundException extends RuntimeException {
	
	public ItemNotFoundException(String message)
	{
		super(message);
	}

}
