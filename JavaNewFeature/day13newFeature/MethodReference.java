package com.techment.day13newFeature;


interface Calculation
{
	void Display();
}

class Hello
{
	void Message()
	{
		System.out.println("todays is holiday");
	}
}

public class MethodReference {

	public static void main(String[] args) {
		// lamba expression for defining the body of abstract function
		Calculation calculation=()-> System.out.println("today is holiday by lambda expression");
		calculation.Display();
		
		//Method refernce non static method or instance method
		
		Hello hello =new Hello();
		Calculation calculation2 =hello::Message;
		calculation2.Display();
	}

}
