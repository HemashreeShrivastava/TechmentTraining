package com.techment.day7.DynamicArray;
import java.util.*;
public class iteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>o1 =new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		System.out.println("element of o1"+o1);
		Iterator<Integer> itr =o1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
