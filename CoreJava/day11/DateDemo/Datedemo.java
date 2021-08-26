package com.techment.day11.DateDemo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDateTime dateTime= LocalDateTime.now();
		LocalDate birthDate = LocalDate.of(2000,11, 30);
		System.out.println(date.isAfter(birthDate));
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String strDate = formatter.format(date1);
		System.out.println("Date Format with MM/dd/yyyy : "+strDate);


	}

}
