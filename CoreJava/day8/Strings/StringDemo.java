package com.techment.day8.Strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";//by literal
		String s2="hello";
		String s3=new String("hello");//by new keyword
		String s4=new String("hello");//by new keyword
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s4));
		System.out.println(s1==s3);
		
		

	}

}
