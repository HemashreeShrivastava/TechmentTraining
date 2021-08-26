package com.techment.day14_15.multiThreading;
class Apple extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			/*if(i==2)
			{
				stop();//kill the thread we can not call back
			}*/
		System.out.println("eat apple"+Thread.currentThread().getName());
		}}
	}
class Banana extends Thread
{
	public void run()
	{for(int i=0;i<5;i++)
	{
		System.out.println("eat banana"+Thread.currentThread().getName());
	}
	}
}

public class ThreadNaming {

	public static void main(String[] args) {
			
		System.out.println(Thread.currentThread().getName());
		Banana banana=new Banana();
		Apple apple=new Apple ();
		apple.setName("Apple");
		banana.setName("Banana");
		banana.setPriority(8);
		apple.setPriority(2);
		apple.start();
		banana.start();
	//	banana.suspend();
	//	banana.resume();
		
	}

}
