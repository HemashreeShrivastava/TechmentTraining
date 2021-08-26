package com.techment.day2_3;

import java.util.Scanner;

public class showMarks {
    public static int sumOf(int []a)
    {
    	int add = 0;
		for(int i=0;i<a.length;i++)
		{
			
			add = add + a[i];
				
			
		}
		return add;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the total number of student marks");
		int n = sc.nextInt();
		System.out.println("enetr each marks value");
		int [] marks;
		marks=new int[n];
		for(int i =0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println(" the marks you entered are as follows");
		for(int i =0;i<n;i++)
			{
				System.out.print("\t"+ marks[i]);
			}
		
		int add = sumOf(marks);
		System.out.println("\n the sum of all the marks :"+ add);
		
		for(int i =0;i<marks.length;i++)
		{
			for (int j = i; j > 0; j--) {
			     if (marks[j] < marks [j - 1]) {
			      int temp = marks[j];
			      marks[j] = marks[j - 1];
			      marks[j - 1] = temp;
			     }
		         }
		
		
	    }
		System.out.println("\n the highest marks is :"+ marks[n-1]);
		System.out.println("\n the lowest marks is :"+ marks[0]);
		System.out.println("\n the second highest marks is :"+ marks[1]);
		Boolean a = true;
		for(int i =0;i<marks.length;i++)
		{
			if(marks[i]<40)
			{
				a=false;
				
			}
			else
			{
				a = true;
		
		}
		
		}
		if(a==false)
		{
			System.out.println("FAIl");
		}
		else
		{
			System.out.println("PASS");
		}
		
		

}
}
