package com.techment.day4;

class Employee extends Person {
	int empid;
	String dept;
	public Employee(int empid, String dept) {
		super(11,"Heena","20");
		this.empid = empid;
		this.dept = dept;
		display();
	}
	void display()
	{
		System.out.println("id"+super.id+"\t");
		System.out.println("name"+super.name+"\t");
		System.out.println("age"+super.age+"\t");
		System.out.println("rollno"+empid+"\t");
		System.out.println("dept"+dept+"\t");
		System.out.println();

	}

}
