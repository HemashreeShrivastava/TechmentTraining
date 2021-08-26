package com.techment.day9.IavaIO;

import java.io.FileWriter;

public class FIleWriteDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter fw =new FileWriter("abc.txt");
		fw.write("hi\n" );
		fw.write("Welcome\n");
		fw.write("Written sucessfully");
		System.out.println("Written sucessfully");
		fw.close();

	}

}
