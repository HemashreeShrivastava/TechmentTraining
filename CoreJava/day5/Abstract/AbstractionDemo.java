package com.techment.day5.Abstract;

abstract class Bank
{
	void ELigibility()
	{
		System.out.println("above 18 can open an account");
		
	}
	abstract int  rateOfInterest(int interestRate);
	
}
// when any class extends abstract means, it need to provide body for abstratc method
class Axis extends Bank 
{

	@Override
	int rateOfInterest(int interestRate) {
		// TODO Auto-generated method stub
		interestRate =2*interestRate;
		System.out.println("Axis bank"+ interestRate);
		return interestRate;
	}
	
	
}
class Kotak extends Bank
{

	@Override
	int rateOfInterest(int interestRate) {
		// TODO Auto-generated method stub
		interestRate =5*interestRate;
		System.out.println("kotak bank"+ interestRate);
		return interestRate;
		
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank =new Axis();
		System.out.println(bank.rateOfInterest(80));

	}

}
