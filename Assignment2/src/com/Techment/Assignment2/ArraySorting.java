package com.Techment.Assignment2;
import java.util.*;
public class ArraySorting {

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
			System.out.println("\t"+arr[i]+"\t");
			
		}
		// logic for sorting array
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		
		}
		System.out.println("the array after sorting is");
		for(int i =0;i<n;i++)
		{
			System.out.println("\t"+arr[i]);
			
		}
	}
}
