package com.techment.day9.IavaIO;

import java.io.*;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
	//	File file =new File("E:\\java2\\abc.txt");
		File file =new File("E:\\java2\\abc");//for folder don't give extention
        System.out.println(file.exists());// no file is being created
        //file.createNewFile();
        file.mkdir();        
        System.out.println(file.exists());// now file gets created
	}

}
