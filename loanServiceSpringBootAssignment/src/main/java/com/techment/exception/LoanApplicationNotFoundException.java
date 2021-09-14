package com.techment.exception;

public class LoanApplicationNotFoundException extends RuntimeException{

	String msg;

	String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LoanApplicationNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public LoanApplicationNotFoundException() {
		super();
	}
	
	
}
