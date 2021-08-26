package com.techment.day2_3;
class CustomerData{
	int id;
	String name;
	int conatct;
	int minBalance;
	CustomerData (int id,String name,int contact,int minBalance)
	{
		this.id=id;
		this.name=name;
		this.conatct=contact;
		this.minBalance=minBalance;
	}
	public String checkAccountType()
	{
		if(this.minBalance == 0)
			return "Zero balance account";
		else if(this.minBalance==1000)
			return "Saving Account";
		else if(this.minBalance==10000)
			return "Current Account";
		return "invalid option";
	}
	public void Display()
	{
		System.out.println("\nname :"+this.name+"\t"+"id :"+this.id+"\t contact :"+this.conatct+"\t minBalance :"+minBalance);
	}
}

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerData Cust1 = new CustomerData(1000,"anita",90001778,1000);
		System.out.println("AccountType of 1st :"+Cust1.checkAccountType());
		CustomerData Cust2 = new CustomerData(1001,"anand",90221778,100);
		System.out.println("AccountType of2nd customer:"+Cust2.checkAccountType());
		CustomerData Cust3 = new CustomerData(1002,"arti",90044778,10000);
		System.out.println("AccountType of 3rd customer:"+Cust3.checkAccountType());
		/*Cust1.checkAccountType();
		Cust2.checkAccountType();
		Cust3.checkAccountType();*/
		
		Cust1.Display();
		Cust2.Display();
		Cust3.Display();
		
		
		

	}

}
