package com.Techment.Assignment2;
import java.util.*;
public class MergeArray {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the size of array1");
		int n = scanner.nextInt();
		System.out.println("enter the size of array2");
		int m = scanner.nextInt();
		System.out.println("enter the element to array1");
		int arr1[]=new int [n];
		for(int i =0;i<n;i++)
		{
			arr1[i]=scanner.nextInt();
			
		}
		System.out.println("enter the element to array2");
		int arr2[]=new int [m];
		for(int i =0;i<m;i++)
		{
			arr2[i]=scanner.nextInt();
			
		}
		System.out.println("the list of element you entered in array 1");
		for(int i =0;i<n;i++)
		{
			System.out.print("\t"+arr1[i]+"\t");
			
		}
		System.out.println("the list of element you entered in array 2");
		for(int i =0;i<m;i++)
		{
			System.out.print("\t"+arr2[i]+"\t");
			
		}
		// merging of array
		int[] result = new int[n + m];
		System.arraycopy(arr1, 0, result, 0, n);  
		System.arraycopy(arr2, 0, result, n, m);  
		System.out.println(Arrays.toString(result));   

	}

}
