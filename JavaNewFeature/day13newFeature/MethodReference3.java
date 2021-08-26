package com.techment.day13newFeature;
@FunctionalInterface
interface Calculate
{
	int add(int a, int b);
	}
class Add
{
	int addition(int a, int b)
	{
		return a+b;
	}
	
	
}
class Sub
{
	int Subtract(int a,int b)
	{
		return a-b;
	}
}


public class MethodReference3 {

	public static void main(String[] args) {
		
		Calculate calculate =(a,b)->a+b;
		
		System.out.println(calculate.add(67,40));
		
	Calculate calculate2 =(a,b)->a+b;
		
		System.out.println(calculate2.add(6,40));
		
		// by method refrence
		Add add= new Add();
		Calculate c1 =add::addition;
		System.out.println(c1.add(3, 4));
		
		Sub sub =new Sub();
		Calculate c2 =sub::Subtract;
		System.out.println(c2.add(4,3));
		
		
		
		
		
	}

}
