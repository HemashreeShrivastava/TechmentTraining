package com.Techment.OppsAssignment_1;

abstract class medicine
{
	double price;
	String Expirydate;
	abstract void displayLabel() ;
	
}
class Tablet extends medicine
{
	
	public Tablet(double d, String string) {
		super.Expirydate=string;
		super.price=d;
		
	}

	void displayLabel() 
	{
		System.out.println("price"+" "+super.price+" "+"Expiry Date"+ " "+super.Expirydate);
		System.out.println("1.Keep in Cool place"+ " "+"2.keep away from childern");
	}
}
class Syrup extends medicine
{

	
	public Syrup(double d, String string) {
		super.Expirydate=string;
		super.price=d;
		// TODO Auto-generated constructor stub
	}

	void displayLabel() 
	{
		System.out.println("price"+" "+super.price+" "+"Expiry Date"+ " "+super.Expirydate);
		System.out.println("1.Keep in Cool place"+ " "+"2.keep away from childer"+" "+"3.Dosage as prescribe by doctor" );
	}
}
class Ointment extends medicine
{

	public Ointment(double d, String string) {
		super.Expirydate=string;
		super.price=d;
		
	}
	void displayLabel() 
	{
		System.out.println("price"+" "+super.price+" "+"Expiry Date"+ " "+super.Expirydate);
		System.out.println("1.Keep in Cool place"+ " "+"2.keep away from childer"+" "+"3.Dosage as prescribe by doctor"+" "+"4.see expiry date");
	}
}

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		medicine [] medicine=new medicine[5]; 
		medicine[0]=new Tablet(78,"20-09-2021");
		medicine[1]=new Syrup(60.0,"21-09-2021");
		medicine[2]=new Ointment(10,"2-09-2021");
		medicine[3]=new Ointment(710,"8-09-2021");
		medicine[0].displayLabel();
		medicine[1].displayLabel();
		medicine[2].displayLabel();
		medicine[3].displayLabel();
		
		
		//medicine.Tablet(78,"20-09-2021");

	}

}
