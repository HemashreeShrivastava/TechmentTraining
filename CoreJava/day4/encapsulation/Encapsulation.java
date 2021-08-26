package com.techment.day4.encapsulation;

 class Employee
 {
	private int id ;
	 private String name;
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
	 
	 
	 /*public void setId(int id)
	 {
		 this.id=id;
	 }
	 public int getId()
	 {
		 return id;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public String getName()
	 {
		 return name;
	 }*/
 }
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee ();
		emp.setId(1);
		emp.setName("sachin");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

}
