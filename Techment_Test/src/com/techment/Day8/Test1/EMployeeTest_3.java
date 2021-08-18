package com.techment.Day8.Test1;
import java.util.*;
class ValidName extends Exception
{
	String msg;

	public ValidName(String msg) {
		super();
		this.msg = msg;
	}
	
}
class Employee1
{
	private String firstName;
    private	String lastName;
	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee1 [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

	
	
}

public class EMployeeTest_3 {

	public static void main(String[] args) throws NullPointerException, ValidName {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first name and last name");
		try 
		{
			String firstName=scanner.next();
			String lastName=scanner.next();
			if(firstName==null || lastName==null)
				System.out.println("null pointer exception");
			else if(firstName.length() <3||lastName.length()<3)
				throw new ValidName("enter valid name");
			Employee1 emp1=new Employee1(firstName, lastName);
			System.out.println(emp1.toString());
		
	
			
		}
		catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
		

	}

}
