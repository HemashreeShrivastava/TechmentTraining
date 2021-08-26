package com.techment.day17Date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate bithDate=LocalDate.of(1989, 11, 30);
		
;
	Period	period=Period.between(bithDate,today);
		System.out.println(period.getYears()+"years"+period.getMonths()+"months");

	}

}
