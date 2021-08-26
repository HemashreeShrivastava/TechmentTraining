package com.techment.day9.IavaIO;

import java.io.*;

public class FileReaderDemo  {

	public static void main(String[] args)throws IOException {
		FileReader fr = new FileReader("abc.txt");
	/*	System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
*/
		int ch =fr.read();
		while(ch!=-1)
		{
			System.out.println((char)ch);
			ch=fr.read();
			//System.out.println(fr.read());//infinite loop it printing -1....
			//System.out.println((char)fr.read());//infinite ? .......is printing
		}
	}

}
