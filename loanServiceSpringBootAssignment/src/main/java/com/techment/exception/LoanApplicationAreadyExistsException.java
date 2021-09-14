package com.techment.exception;

public class LoanApplicationAreadyExistsException extends RuntimeException{

	
	String msg;
	public void  setMsg(String msg)
	{
		this.msg=msg;
	}
	
	public LoanApplicationAreadyExistsException() {
		super();
	}

	public LoanApplicationAreadyExistsException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}

	
}
