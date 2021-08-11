package com.Techment.OppsAssignment_1;

class Address
{
	private String addressLine;
	private String city;
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	String getAddressDetail()
	{
		
		return getAddressLine()+", "+getCity();	
	}
	
	
}
class Customer
{
	private String customerName;
	private Address residentialAddress;
	public Customer() {
		super();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	void getCustomerDetail()
	{
		
		System.out.println("Customer : "+getCustomerName());
		System.out.println("Residential Address : "+residentialAddress.getAddressDetail());
	}
}
public class TestCustomer {

	public static void main(String[] args) {
		Address address =new Address("Ist Main HSR Layout","Bangalore");
		address.getAddressDetail();
		Customer customer =new Customer();
		customer.setCustomerName("John");
		customer.setResidentialAddress(address);
		customer.getCustomerDetail();
		

	}

}
