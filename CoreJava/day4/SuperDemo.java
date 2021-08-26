package com.techment.day4;

class Parent{
	int a =10;
	
}
class Child extends Parent
{
	int a=20;
	void sum()
	{
		int a=4;
		int c=a+super.a;
		System.out.print("SUm c :"+c);
		int s=a+a;
		System.out.print("SUm s :"+s);
		int t=this.a+super.a;
		System.out.print("SUm t :"+t);
		int u=a+a;
		System.out.print("SUm u :"+u);

		
	}
	
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child =new Child();
		child.sum();

	}

}
