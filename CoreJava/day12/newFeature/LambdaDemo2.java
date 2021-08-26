package com.techment.day12.newFeature;

interface Calculation
{
	void add(int a, int b);
	}

public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calculation = (a,b)->System.out.println("result"+(a+b));
	calculation.add(4, 8);
	calculation.add(7, 8);
	}

}
