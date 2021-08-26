package com.techment.day6.Exception;

class AgeException extends RuntimeException
{
	String  msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
class IdNotFoundException extends Exception
{
	String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
	
}

public class CustomeException {

	public static void main(String[] args) throws IdNotFoundException {
		// TODO Auto-generated method stub
		//throw new AgeException("not a valid age");
		throw new IdNotFoundException("not valid id");//checked exception 

	}

}
