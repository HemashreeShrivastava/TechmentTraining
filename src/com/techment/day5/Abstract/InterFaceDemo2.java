package com.techment.day5.Abstract;

interface Bank1
{
	void rateOfInterest();
}
class Axis1 implements Bank1
{
	public void rateOfInterest()
	{
		System.out.println("4%");
	}
}
class kotak1 implements Bank1
{
	public void rateOfInterest()
	{
		System.out.println("6%");
	}
}

public class InterFaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
