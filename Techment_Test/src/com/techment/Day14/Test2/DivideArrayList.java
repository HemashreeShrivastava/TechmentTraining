package com.techment.Day14.Test2;
import java.util.*;
public class DivideArrayList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enetr the size of arrylist you want to create");
		int n = scanner.nextInt();
		System.out.println("Enter the element in arraylist");
		ArrayList<Integer> list=new ArrayList<Integer>();
		List <Integer> list1 =new ArrayList<Integer>();
		List <Integer> list2 =new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(scanner.nextInt());
		}
		System.out.println(" the element in arraylist are as "+ list);
		if(n%2==0)
		{
			for(int i=0;i<n;i++)
			{
				if(i<n/2)
				list1.add(list.get(i));
				else
				list2.add(list.get(i));
			}
		
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				if(i<=n/2)
				list1.add(list.get(i));
				else
				list2.add(list.get(i));
			}
		
		}
		System.out.println(list1);
		System.out.println("the maximum number from list 1 after dividing original list"+" "+list1+Collections.max(list1));
		System.out.println(list2);
		System.out.println("the maximum number from list 2 after dividing original list"+list1+" "+Collections.max(list2));
	}

}
