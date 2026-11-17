package com.enums;

public enum StatusCode {
	
	SUCCESS(200), NOTFOUND(404);
	
	int code;
	
	private StatusCode(int code) {
		this.code=code;
	}

}
