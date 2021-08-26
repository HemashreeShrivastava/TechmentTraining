package com.techment.day9.JavaIo;
import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw=new FileWriter("E:\\java2\\printl.txt");
		PrintWriter out=new PrintWriter(fw);
		out.write(100);
		out.println(100);
		out.println(true);
		out.println('c');
		out.println("bhaskar");
		out.flush();
		out.close();

	}

}
