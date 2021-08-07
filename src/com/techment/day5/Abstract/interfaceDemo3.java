package com.techment.day5.Abstract;

interface one
{
	void greet();//we can override one greet ()
	void greet1();
}
interface two
{ void greet();//we
	void greet2();
}
class manager
{
	void operationRegion() {}
}

class Employee extends manager implements one,two
{
	public void greet() {}
	public void greet2() {
		
	}
	public void greet1() {
		
	}
}
public class interfaceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
