package com.techment.day8.Collection;

import java.util.*;
class Employee implements Comparable<Employee> 
{
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.age==o.age)
		return -1;
		else if(this.age>o.age)
			return 1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	
}
public class UserDefinedExample {

	public static void main(String[] args) {
		ArrayList<Employee>employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"ramesh","hr",34));
		employees.add(new Employee(1,"anil","manager",78));
		employees.add(new Employee(3,"sunil","hr",78));
		employees.add(new Employee(4,"manoj","developer",20));
         //Collections.sort(employees);// we can able to sort because class must implements comparable
		
		System.out.println(employees);//we get unsorted form of data for sorting we need to write logic
	// print one by one
	 for(Employee emp : employees)
	 {
		 System.out.println(emp.id+" " + emp.name+" " +emp.dept+" "+emp.age);
	 }
	 
	 System.out.println("after sorting we get");
	 Collections.sort(employees);
	 for(Employee emp : employees)
	 {
		 System.out.println(emp.id+" " + emp.name+" " +emp.dept+" "+emp.age);
	 }
	}
	
	

}
