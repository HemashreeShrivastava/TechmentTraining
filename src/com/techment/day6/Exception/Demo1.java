package com.techment.day6.Exception;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("name is Hemashree");
		System.out.println("email hemashree26698@gmail.ocm");
		/* System.out.println(1/0); here exception occur*/
		int arr[]=new int[5];
		try
		{
			System.out.println(1/0);
			arr[7]=24;
			System.out.println(8/2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("must not be zero");
		}
	    catch(ArrayIndexOutOfBoundsException e)
		{
	    	System.out.println("array size must be from 0 to 4");
		}
		catch (Exception e)
		{
			System.out.println("don't give zero");
		}
		System.out.println("Contact 8976543245");
	}

}
