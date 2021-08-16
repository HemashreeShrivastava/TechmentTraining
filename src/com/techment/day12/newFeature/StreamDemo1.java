package com.techment.day12.newFeature;

import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num =new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(4);
		System.out.println(num);
		num.stream().forEach(i->System.out.println(i));
		num.stream().forEach(System.out::println);
	}

}
