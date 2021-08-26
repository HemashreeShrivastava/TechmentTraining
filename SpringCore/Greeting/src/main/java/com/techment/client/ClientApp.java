package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.modal.GreeterService;



public class ClientApp {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();//all beans will get ready
		GreeterService gs=(GreeterService)context.getBean("greeterService");
		gs.printGreeting();
	}
}
