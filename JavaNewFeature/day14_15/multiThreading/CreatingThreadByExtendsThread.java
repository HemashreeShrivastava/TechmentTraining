package com.techment.day14_15.multiThreading;


class Message extends Thread
{
	public void run()
	{
		System.out.println("This is my task");
	}
			
	}

public class CreatingThreadByExtendsThread {

	public static void main(String[] args) {
		Message message =new Message();
		message.start();

	}

}
