package com.Techment.OppsAssignment_1;

class Address1
{
	private String Address1Line;
	private String city;
	public Address1(String Address1Line, String city) {
		super();
		this.Address1Line = Address1Line;
		this.city = city;
	}
	public String getAddress1Line() {
		return Address1Line;
	}
	public void setAddress1Line(String Address1Line) {
		this.Address1Line = Address1Line;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	String getAddress1Detail()
	{
		
		return getAddress1Line()+", "+getCity();	
	}
	
	
}
class Customer1
{
	private String Customer1Name;
	private Address1 residentialAddress1;
	private Address1 officialAddress1;
	
	
		public Customer1(String customer1Name, Address1 residentialAddress1, Address1 officialAddress1) {
		super();
		Customer1Name = customer1Name;
		this.residentialAddress1 = residentialAddress1;
		this.officialAddress1 = officialAddress1;
	}

		void getCustomer1Detail()
	{
		
		System.out.println("Customer1 : " );
		System.out.println("Residential Address : "+residentialAddress1.getAddress1Detail());
		System.out.println("Official Address : "+officialAddress1.getAddress1Detail());
	}
}


public class TestCustomer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address1 address =new Address1("Ist Main HSR Layout","Bangalore");
		Address1 officialAddress =new Address1("IIst Main Electronics city","Bangalore");
		address.getAddress1Detail();
		Customer1 customer =new Customer1("John",address,officialAddress);
		
		customer.getCustomer1Detail();

	}

}
