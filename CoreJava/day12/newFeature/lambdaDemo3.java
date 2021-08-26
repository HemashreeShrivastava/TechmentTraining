package com.techment.day12.newFeature;

interface Calc
{
	int add(int a, int b);
	}
public class lambdaDemo3 {
	public static void main(String[] args)
	{
		Calc cal = (a,b)->a+b;
		Calc cal2=(a,b)->
		{
			if(a>b)
				return a;
			return b;
		};
		System.out.println(cal.add(2,4));
		System.out.println("largest of two number"+cal.add(2,4));
	}

}
