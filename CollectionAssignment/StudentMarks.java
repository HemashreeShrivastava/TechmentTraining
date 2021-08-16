package com.Techment.CollectionAssignment;
import java.util.*;
public class StudentMarks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Students");
		int n= scanner.nextInt();
		System.out.println("Enter Marks");
		ArrayList<Integer> marks =new ArrayList<Integer>();
		for(int i =0;i<n;i++)
		{
			marks.add(scanner.nextInt());
		}
		int sum=0;
		float avg=0f;
		for(Integer in : marks)
		{
			sum = in+sum;
			avg=sum/n;
		}
		int j = 1;
		int k=1;
		System.out.println("Highest Marks :"+Collections.max(marks));
		System.out.println("Average Marks :"+avg);
		System.out.println("Marks :");
		for(Integer in : marks)
		{
			
			System.out.print(j+"-"+in+"\t");
			j++;
			
		}
		System.out.print("\n");
		System.out.println("3rd Student marks :"+marks.get(2));
		System.out.println("Sorted :");
		Collections.sort(marks);
		for(Integer in : marks)
		{
			System.out.print(k+"-"+in+"\t");
		}
		
		
		
		

	}

}
