package com.techment.day12.newFeature;

import java.util.function.Predicate;

public class InBuiltFunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> predicate = (num)->num>10;
		System.out.println(predicate.test(20));
		Predicate<String> strPredicate = (name)->name.contains("a");
		System.out.println(strPredicate.test("hello"));
		
		
	}

}
