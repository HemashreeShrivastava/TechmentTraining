package com.techment.Day14.Test2;

public class RepeatString {

	public String repeatFront(String str, int n)
	{
		String rFont=" ";
		for(int i=0;i<=n+1;i++)
			for(int j=0;j<n;j++)
			{
				{
					rFont=rFont+str.substring(0,n);
					n=n-1;

				}
			}

		return rFont;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatString r= new RepeatString();
		System.out.println(r.repeatFront("Chocolate", 4));
		System.out.println(r.repeatFront("Chocolate", 3));
		System.out.println(r.repeatFront("Ice Cream", 2));

	}

}
