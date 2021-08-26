package com.techment.day7.DynamicArray;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList o1=new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.add(5);
		o1.addFirst(100);
		System.out.println("LinkedList"+ o1);
		o1.removeLast();
		System.out.println("LinkedList"+ o1);
		
	}

}
