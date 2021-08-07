package com.Techment.Assignment2;

import java.util.*;

public class FindElement {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int index=0;
			System.out.print("\n enter the size of array");
			int n =sc.nextInt();
			int array1 []=new int [n];
			System.out.print("\n enter the elemernt to array");
			for(int i=0;i<n;i++)
			{
				array1[i]=sc.nextInt();
			}
			System.out.print("\n here are the list of element you entered");
			for(int i=0;i<n;i++)
			{
				System.out.print("\t"+array1[i]);
			}
			System.out.print("\n enter the element you want to search and know the index value");
			int element = sc.nextInt();
			
			Boolean check =true;
			for(int i =0;i<array1.length;i++)
			{
				if(element==array1[i])
				{
					index = i;
					
					
			    }
				else
				{
					check = false;
				}
			}
			if(check==false)
			{
				
				System.out.println("-1");
			}
			else
			{
				System.out.println("The element is at "+ index);
			}
			
		}


}
