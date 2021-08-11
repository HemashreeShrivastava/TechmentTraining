package com.techment.day7.DynamicArray;

import java.util.ArrayList;
import java.util.*;

public class ModifyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>o1 =new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		System.out.println("element of o1"+o1);
		for(Integer o:o1)
		{
			if(o>3)
				o1.remove(o);
				//o1.add(100);// concurrent modification error
			System.out.println(o);
		}
				

	}

}
