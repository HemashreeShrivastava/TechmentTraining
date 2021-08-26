package com.techment.day7.DynamicArray;
import java.util.*;
class Employee
{
	private int id ;
	private String name;
    private	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp =new Employee(1,"sachin","hr");
		Employee emp1 =new Employee(2,"Ravi","hr");
		ArrayList<Employee>employee=new ArrayList<Employee>();
		employee.add(emp);
		employee.add(emp1);
		employee.add(new Employee(3,"mishi","sales"));
	/*	for(Employee emp2 : employee)
		{
			System.out.println(emp2.id+" "+emp2.name+" "+emp2.dept);
		}
		employee.set(1,new Employee(100,"mishi","sales"));//updation of alue
		for(Employee emp2 : employee)
		{
			System.out.println(emp2.id+" "+emp2.name+" "+emp2.dept);
		}*/
		
		for(Employee empo:employee)
		{
			if(emp.getId()>2)
			{
				emp.setDept("manager");
				System.out.println(empo.getId()+" "+empo.getName()+" "+empo.getDept());
			}
		}
	}

}
