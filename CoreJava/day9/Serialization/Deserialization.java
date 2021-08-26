package com.techment.day9.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fls =new FileInputStream("E:\\techment\\hello.txt");
		ObjectInputStream oos = new ObjectInputStream(fls);
		Employee e =(Employee)oos.readObject();
		System.out.println(e.id);
		System.out.println(e.name);

	}

}
