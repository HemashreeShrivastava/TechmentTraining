package com.techment.day17Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		DateTimeFormatter  difi =DateTimeFormatter.ofPattern("yyyy MM dd");

		DateTimeFormatter  difi1 =DateTimeFormatter.ofPattern("yyyy MMM dd");


		DateTimeFormatter  difi2 =DateTimeFormatter.ofPattern("yyyy/MMM/dd");

		DateTimeFormatter  difi3 =DateTimeFormatter.ofPattern("MMM dd");

		DateTimeFormatter  difi4 =DateTimeFormatter.ofPattern("MMM dd E");

		DateTimeFormatter  difi5 =DateTimeFormatter.ofPattern("MMM dd EEEE");
	
		System.out.println(today.format(difi));
		System.out.println(today.format(difi1));
		System.out.println(today.format(difi2));
		System.out.println(today.format(difi3));
		System.out.println(today.format(difi4));
		System.out.println(today.format(difi5));
		
		
	}

}
