package com.techment.day7.DynamicArray;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		System.out.println("size before adding element "+obj.size());
		int a =1;
		Integer b=a;
		obj.add(1);
		obj.add('x');
		obj.add(90.4);
		obj.add("sachin");
		System.out.println("size after adding element "+obj.size());
        obj.add(1,"hello");
        System.out.println("size before adding element at 1st index "+obj.size());
        System.out.println("element in list"+obj);
        //obj.remove("hello");
     //   obj.remove(Integer.valueOf("hello"));
        System.out.println("element in list after removing"+obj);
        System.out.println("element at 2 : "+obj.get(2));
	}

}
