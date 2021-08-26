package com.techment.day6.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				try {System.out.println("enter num1");
		int a=scanner.nextInt();
		System.out.println("enter num2");
		int b=scanner.nextInt();
			int result = a/b;
			System.out.println("result"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("you must not enter 0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("you must not enter character");
		}

	}

}
