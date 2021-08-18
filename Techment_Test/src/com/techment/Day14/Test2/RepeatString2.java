package com.techment.Day14.Test2;

public class RepeatString2 {

	public String repeatEnd(String str, int n)
	{
		String rEnd=" ";
		for(int i=0;i<=n+1;i++)
			for(int j=0;j<n;j++)
			{
				{
					rEnd=rEnd+str.substring(str.length()-n);
					n=n-1;

				}
			}

		return rEnd;

	}

	public static void main(String[] args) {
		RepeatString2 r1= new RepeatString2();
		System.out.println(r1.repeatEnd("Hello", 3));
		System.out.println(r1.repeatEnd("Hello", 2));
		System.out.println(r1.repeatEnd("Hello", 1));

	}

}
