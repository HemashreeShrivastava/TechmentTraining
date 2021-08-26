package com.techment.day13newFeature;

interface A
{
	Student getStudentDetail();
}

class Student
{
	int id;
	String name;
	
	void display() 
	{
		System.out.println("this is student info");
	}
	}

public class ConstructorReference {

	public static void main(String[] args) {
		A a= ()->{
			
			Student s = new Student();
			return s;
		};
		A a1=()->new Student();
		a.getStudentDetail().display();
		a1.getStudentDetail().display();
		
		// by using method reference
		A obj = Student::new;
		obj.getStudentDetail().display();
	}

}
