package com.techment.day6.Exception;

public class Account {
	int balance = 5000;
	String withdraw(int amount)
	{
		if(amount<balance)
		{
			throw new InsufficientFundException("Inssufficient fund");
			
		}
		else
			return "you have withdraw";
			
	}

}
