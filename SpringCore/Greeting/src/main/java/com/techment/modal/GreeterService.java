package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class GreeterService {
	@Autowired@Qualifier("morningGreeting") 
	Greeting greeting;
	
	public void printGreeting()
	{
		System.out.println(greeting.toString());
	}

}
