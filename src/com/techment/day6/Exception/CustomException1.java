package com.techment.day6.Exception;

public class CustomException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account =new Account();
		try
		{
			System.out.println(account.withdraw(200000));
		}
		catch(InsufficientFundException e)
		{
			System.out.print("insufficient fund");
		}

	}

}
