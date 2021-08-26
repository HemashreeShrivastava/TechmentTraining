package com.techment.modal;

import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting {
    String greeting="Good morning";
	@Override
	public String toString() {
		return "Morning Greeting";
	}
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
