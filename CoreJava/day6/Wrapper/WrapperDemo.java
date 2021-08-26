package com.techment.day6.Wrapper;

public class WrapperDemo {
	public static void main(String Args[])
	{

	int a =100;
	Integer b=a;//autoboxing
	int c=b.intValue();//unboxing
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
