package com.Techment.CollectionAssignment;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class FetchState {

	public static void main(String[] args) throws IOException {
		LinkedHashSet<String> StateSet=new LinkedHashSet<String>();
		FileReader fr =new FileReader("E:\\java2\\states.txt");
		BufferedReader br =new BufferedReader(fr);
		String line = br.readLine();
		while(line !=null)
		{
			//System.out.println(line);
			line=br.readLine();
			StateSet.add(line);		
		}
		br.close();
		System.out.println("the total number of state are"+StateSet.size());
		System.out.println("the set after removing Delhi from  it"+StateSet.remove("Delhi"));
		System.out.println("the total number of state are"+StateSet);
		ArrayList<String> tset=new  ArrayList<String>(StateSet);
		while(tset.remove(null)) {}
		Collections.sort(tset);
		System.out.println("the total number of state are"+tset);
		System.out.println("the state list which starts with K");
		for(String t:tset)
		{
			
		
				if(t.startsWith("K"))
				{
                    System.out.println(t);
				}
		
		}
		
	}

}
