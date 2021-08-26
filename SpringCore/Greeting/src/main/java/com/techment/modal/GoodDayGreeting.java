package com.techment.modal;

import org.springframework.stereotype.Component;

@Component
public class GoodDayGreeting implements Greeting {

	@Override
	public String toString() {
		return "GoodDay Greeting";
	}

	String greeting ="have a good day";
	
	public String greet() {
		
		return "greeting";
	}

}
