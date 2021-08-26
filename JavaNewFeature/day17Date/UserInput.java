package com.techment.day17Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your DoB");
		String dob = scanner.next();
		System.out.println(dob);

		//DateTimeFormatter difi = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		DateTimeFormatter difi = DateTimeFormatter.ofPattern("yy/MMM/dd");
		LocalDate birthDate=LocalDate.parse(dob, difi);
		
		System.out.println("birthday"+birthDate);
		System.out.println("birthdate in given format"+birthDate.format(difi));
	}

}
