package com.techment.day11.newFeature;

class Parent
{
	void phone()
	{
	System.out.println("mi");
}}
public class AnonomysInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		parent.phone();
		
		Parent parent2 =new Parent()
				{
			void phone()
			{
				System.out.println("Samsung");
			}
			
				};
				parent2.phone();

	}

}
