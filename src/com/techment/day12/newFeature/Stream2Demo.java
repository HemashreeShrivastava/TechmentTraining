package com.techment.day12.newFeature;
import java.util.*;
public class Stream2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer> ();
		for(int i=0;i<10;i++)
		{
			numbers.add(i);
		}
		System.out.println("the even number");
		System.out.println("number"+numbers);
		numbers.stream().filter(num->num%2==0).forEach(s->System.out.println(s));
		
		numbers.stream().map(num->num+5).forEach(s->System.out.println(s));
		
		numbers.stream().map(num->"after adding 100"+" :"+(num+100)).forEach(s->System.out.println(s));
		 numbers.stream().limit(2).forEach(s->System.out.println(s));
		
	
	}

}
