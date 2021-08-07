package com.techment.day4;

public class Student extends Person {
	int rollno;
	String dept;
	public Student(int rollno, String dept) {
		super(11,"Harini","20");
		this.rollno = rollno;
		this.dept = dept;
		display();
	}
	void display()
	{
		System.out.println("id"+super.id+"\t");
		System.out.println("name"+super.name+"\t");
		System.out.println("age"+super.age+"\t");
		System.out.println("rollno"+rollno+"\t");
		System.out.println("dept"+dept+"\t");
		System.out.println();

	}

}
