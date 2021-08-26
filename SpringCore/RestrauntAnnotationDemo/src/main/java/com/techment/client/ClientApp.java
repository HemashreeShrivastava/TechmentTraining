package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.modal.Restraunt;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();//all beans will get ready
		Restraunt restraunt =(Restraunt)context.getBean("restraunt");
	
		restraunt.displayRestrauntDetails();
	}

}
