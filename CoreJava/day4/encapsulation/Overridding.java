package com.techment.day4.encapsulation;

class Bank
{
	public void rateOfInterest()
	{
		System.out.println("3%");
	}
	public void openAccount()
	{
		System.out.println("your age 18 you can open account ");
	}
	
}
class SBI extends Bank
{
	public void rateOfInterest()
	{
		System.out.println("5%");
	}
	public void loan() 
	{
		System.out.println("you can apply for loan");
	}
}
class Axis extends Bank
{
	@Override
	public void rateOfInterest()
	{
		System.out.println("7%");
	}
}
public class Overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	SBI sbi = new SBI();
	//	sbi.loan();
		//Axis axis = new Axis();
		//sbi.rateOfInterest();
		//axis.rateOfInterest();
		
		Bank bank = new SBI();//loosely coupled this is called upcasting
		// upcasting create object from parent class
bank.rateOfInterest();
// bank.loan(); by upcasting we can  not call child class method
	bank.openAccount();
	}

}
