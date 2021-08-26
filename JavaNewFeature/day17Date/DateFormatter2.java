package com.techment.day17Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today =LocalDate.now();
		DateTimeFormatter full=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter longDate=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
				
		DateTimeFormatter medium=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter shortDate=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

		System.out.println(today.format(full));

		System.out.println(today.format(shortDate));

		System.out.println(today.format(medium));

		System.out.println(today.format(shortDate));
		
		LocalDateTime todaydatetime=LocalDateTime.now();
		System.out.println(todaydatetime);
		DateTimeFormatter fullLength = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		//System.out.println(fullLength.format(shortDate));
			ZonedDateTime date= ZonedDateTime.now();
			System.out.println(date);
			System.out.println(date.format(fullLength));
		
		
	}

}
