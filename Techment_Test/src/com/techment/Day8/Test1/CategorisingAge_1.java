package com.techment.Day8.Test1;

public class CategorisingAge_1 {

	public static void main(String[] args) {
		
		int age[]= {37,78,56,7,67,20,50};
		int children=0;
		int senior=0;
		int adult=0;
		
		
		for(int i=0;i<age.length;i++)
		{
			if(age[i]<18)
			{
				children = children+1;
			}
			else if(age[i]>=18 && age[i]<54)
			{
				adult=adult+1;
			}
			else
			{
				senior=senior+1;
				
			}
		}
		System.out.println("Children :"+children);
		System.out.println("Adult :"+adult);
		System.out.println("Senior Citizen :"+senior);
		

	}

}
