package com.techment.day17Date;

import java.time.LocalDate;

public class DateParse {

	public static void main(String[] args) {
		
		String dob = "30/11/1989";
		String joiningDate="2020-02-22";
		System.out.println("date of  birth:"+dob);
		System.out.println("date of  birth:"+joiningDate);
		LocalDate joiningDateAfterParse=LocalDate.parse(joiningDate);
		System.out.println(joiningDateAfterParse);
		System.out.println(joiningDateAfterParse.getYear());
		System.out.println(joiningDateAfterParse.getMonth());
		
		//parsing for joining date
		
		LocalDate today=LocalDate.now();
		LocalDate joiningdate=LocalDate.parse(joiningDate);
		LocalDate birthdate=LocalDate.of(1989, 11, 30);
		
		
	}

}
