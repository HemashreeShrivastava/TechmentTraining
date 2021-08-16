package com.techment.day9.JavaIo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
            FileWriter fw = new FileWriter("E:\\java2\\cricket.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(100);
            bw.newLine();
            char[] ch= {'a','b','c','d'};
            bw.write(ch);
            bw.newLine();
            bw.write("bhaskar");
            bw.newLine();
            bw.write("Software Solution");
           // bw.flush();
            bw.close();
            
	}

}
