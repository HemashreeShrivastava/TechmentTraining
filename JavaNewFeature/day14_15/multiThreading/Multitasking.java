package com.techment.day14_15.multiThreading;

class Sanika extends Thread
{
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Sanika :"+i+"msg : welcome to banglore");
		}
	}
	
}
class Parul extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Parul :"+i+"msg : take vaccination");
		}
	}
	
}
class Amit extends Thread
{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Amit :"+i+"msg : covid 19 is not over yet");
		}
	}
	
}
public class Multitasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sanika sanika=new Sanika();
		Parul parul=new Parul();
		Amit amit =new Amit();
		
		//sanika.run();//normal execution not multitasking
		//parul.run();//normal execution not multitasking
		//amit.run();//normal execution not multitasking
		
		sanika.start();
		parul.start();
		amit.start();
		
	}

}
