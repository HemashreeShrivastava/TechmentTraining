package com.techment.day4.polymorphism;

class Hello
{
	public void write(int num)
	{
		System.out.println("You have written number an number is"+num);
	}
	public void write(String msg)
	{
		System.out.println("You have written character and character  is"+msg);
	}
	public int addition(int a,int b)
	{
		return a+b;
	}
	public int addition(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hello hello=new Hello ();
        hello.write(0);
        hello.write("hello");
        System.out.println(hello.addition(1, 2));
        System.out.println(hello.addition(1, 2,3));
	}

}
