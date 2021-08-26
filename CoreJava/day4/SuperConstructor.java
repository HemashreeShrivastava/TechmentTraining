package com.techment.day4;

class parent1
{
	parent1(int a)
	{
		
		System.out.println("This is parent class constructor"+a);
	}
	}
class child1 extends parent1
{
	child1(){
		super(2);
	System.out.println("This is child class constructor");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1  child1 = new child1();
	}

}
