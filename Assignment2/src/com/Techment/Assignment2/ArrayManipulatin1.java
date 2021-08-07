package com.Techment.Assignment2;

import java.util.*;


public class ArrayManipulatin1 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scanner.nextInt();
		System.out.println("enter the element to array");
		int arr[]=new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
			
		}
		System.out.println("the list of element you entered");
		for(int i =0;i<n;i++)
		{
			System.out.println("\t"+arr[i]);
			
		}
		// logic for sorting array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				int temp = arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
			}
		}
		System.out.println("the largest number within array are"+arr[0]);
		System.out.println("the 2nd largest number within array are"+arr[1]);
		System.out.println("the  smallest number within array are"+arr[arr.length-1]);
		System.out.println("the 2nd smallest number within array are"+arr[arr.length-2]);
		
	}

}
