package com.techment.day17Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo1 {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now().getDayOfYear());
		System.out.println(LocalDateTime.now().getDayOfMonth());
		System.out.println(LocalDateTime.now().getDayOfWeek());
		LocalDate today=LocalDate.now();
        System.out.println("today "+today);
        System.out.println(today.plusMonths(2));
        System.out.println(today.plusYears(1));
        System.out.println(today.plusWeeks(1));
    	
	
	}

}
