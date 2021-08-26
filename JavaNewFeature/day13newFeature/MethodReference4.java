package com.techment.day13newFeature;
interface Calc
{
       int add(int a, int b);
	}
class CalculationUtilMY
{
	static int addition(int a, int b)
	{
		return a+b;
	}
	static int Subtract(int a,int b)
	{
		return a-b;
	}
	
}


public class MethodReference4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationUtilMY c1 = new CalculationUtilMY();
		Calc c = CalculationUtilMY::addition;
		System.out.println(c.add(10, 30));

	}

}
