package com.Techment.ExceptionAssignment;

import java.util.*;

class NameStartWithC extends RuntimeException
{
	String  msg;

	public NameStartWithC(String msg) {
		super();
		this.msg = msg;

	}
}
class characterValidation extends RuntimeException
{

	String  msg;

	public characterValidation(String msg) {
		super();
		this.msg = msg;
	}
}
class CategoryValidation extends RuntimeException
{

	String  msg;

	public CategoryValidation(String msg) {
		super();
		this.msg = msg;
	}
}
class Customer
{

	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}


public class TestCustomer {

	public static void main(String[] args) throws NameStartWithC, CategoryValidation,characterValidation {
		Scanner scanner=new Scanner(System.in);
		System.out.println("++++++++++++++Enter the customer detail++++++++++");
		System.out.println("enter the customer's number");
		String id=scanner.next();
		System.out.println("enter the customer's name");
		String name=scanner.next();
		System.out.println("enter the customer's category");
		String category =scanner.next();
		Customer cs =new Customer("c100","fgdfvhh","gsdvux");
		String check=cs.getCustNo();
		if(!check.startsWith("C") && !check.startsWith("c"))
		{
			throw new  NameStartWithC("custNo must start with ‘C’ or ‘c’");
		}
		else if(cs.getCustName().length()<4)
		{
			throw new  characterValidation("custName must be atleast of 4 characters");
		}
		else if(!cs.getCategory().equals("silver") )
		{
			System.out.println(cs.getCategory());
			throw new  CategoryValidation("category must be either ‘Platinum’, ‘Gold’ or ‘Silver ‘");
		}
		else
		{
			System.out.println("CustomerNo"+" "+cs.getCustNo()+"CustomerName"+" "+cs.getCustName()+"CustomerCategory"+" "+cs.getCategory());
		}
	}

}
