package com.techment.day9.Serialization;

import java.io.Serializable;
import java.beans.Transient;
import java.io.*;
class Employee implements Serializable
{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		Transient this.name = name;
	}
	
	
	
}

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp1=new Employee (1,"Sachin");
		System.out.println("Serialization start");
		FileOutputStream fls=new FileOutputStream("E:\\java2\\hello.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fls);
		oos.writeObject(emp1);
		System.out.println("Serialization start");
	}

}
