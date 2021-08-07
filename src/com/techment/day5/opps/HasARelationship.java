package com.techment.day5.opps;

class Employee
{
	int id;
	String name;
	Address address;//object reference
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void displayEmployeeInfo()
	{
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("doorNo : "+address.doorNo);
		System.out.println("city : "+address.city);
		System.out.println("pincode: "+address.pincode);
		System.out.println("street name: "+address.streetName);
	}
	
	
}
class Address
{
	int doorNo;
	String streetName;
	String city;
	int pincode;
	
	public Address(int doorNo,String streetName,String city,int pincode)

	{
		 super();
		 this.doorNo=doorNo;
		 this.city=city;
		 this.pincode=pincode;
		 this.streetName=streetName;
		 
	}
	
}
public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address(101,"BTM","Durg",491001);
		Employee emp1=new Employee(1,"hema",address);
		emp1.displayEmployeeInfo();
		

	}

}
