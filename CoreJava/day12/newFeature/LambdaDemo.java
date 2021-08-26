package com.techment.day12.newFeature;

interface Bank2
{
	void diaplay();
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*single line body*/
		Bank2 bank= ()->System.out.println("this is display method");
        bank.diaplay();
        
        /*multi line body*/
        Bank bank2 =()->
        {
        	System.out.println("this is display method of multiline body");
        	System.out.println("THis multiline body");
        };
        bank2.display();
	}

}
