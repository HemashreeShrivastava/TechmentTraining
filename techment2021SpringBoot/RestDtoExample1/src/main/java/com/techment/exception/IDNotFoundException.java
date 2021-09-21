package com.techment.exception;

public class IDNotFoundException extends RuntimeException{

	String mag;
	

	public IDNotFoundException(String mag) {
		super();
		this.mag = mag;
	}

	public String getMag() {
		return mag;
	}

	public void setMag(String mag) {
		this.mag = mag;
	}
	
	
}
