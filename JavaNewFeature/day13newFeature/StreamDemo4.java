package com.techment.day13newFeature;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class StreamDemo4 {
	public static void main(String args[])
	{
	ArrayList<Integer> num =new ArrayList<Integer>();
	num.add(1);
	num.add(2);
	num.add(4);
	num.add(34);
	num.add(12);
	num.add(40);
	System.out.println(num);
	num.forEach(s->System.out.println(s));
	
	
	num.forEach(System.out::println);
	System.out.println("after sorting we will have");
	num.stream().sorted().forEach(System.out::println);
	
	List<Integer>mySorted=num.stream().sorted().collect(Collectors.toList());
	System.out.println();
}
}