package com.techment.Day14.Test2;
import java.util.*;
public class TrafficLightSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the color for traffic light simulation");
		String color=scanner.next();
		if(color.equals("Red")||color.equals("red"))
		{
			System.out.println("Stop");
		}
		else if(color.equals("green")||color.equals("Green"))
		{
			System.out.println("Go");
		}
		else if(color.equals("Yellow")||color.equals("yellow"))
		{
			System.out.println("Ready");
		}
		
		else
		{

			System.out.println("You have entered wrong color");
		}

	}

}
