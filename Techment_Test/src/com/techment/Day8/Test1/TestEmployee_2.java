package com.techment.Day8.Test1;

class Employee
{
	private String firstName;
    private	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}

public class TestEmployee_2 {

	public static void main(String[] args) {
		Employee emp1=new Employee("Reema","Verma");
		Employee emp2=new Employee("Rohn","Mishra");
		Employee emp3=new Employee("Sammer","Shah");
		System.out.println(emp1.toString());
		System.out.println(emp1.toString());
		System.out.println(emp1.toString());
		

	}

}
