package com.techment.day14_15.multiThreading;

class Info implements Runnable
{

	@Override
	public void run() {
		System.out.println("this is my task");
		
	}
	
	}


public class CreatingThreadByImplementsRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Info info=new Info();
		info.run();
		Thread thread =new Thread(info);
		thread.start();

	}

}
