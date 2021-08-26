package com.techment.day7.DynamicArray;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		s1.push(2);
		s1.push(3);
		s1.add(4);
		System.out.println("element of stack"+s1);
		s1.pop();
		System.out.println("after removing"+s1);
		System.out.println("top element"+s1.peek());
	
		

	}

}
