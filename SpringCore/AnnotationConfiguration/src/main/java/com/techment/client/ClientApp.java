package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.services.DatabaseService;

public class ClientApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();//all beans will get ready
		DatabaseService dbservice=(DatabaseService)context.getBean("dbservices");
		dbservice.displayDatabase();
		

	}

}
