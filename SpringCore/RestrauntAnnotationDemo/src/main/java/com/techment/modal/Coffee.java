package com.techment.modal;

import org.springframework.stereotype.Component;

@Component
public class Coffee implements IHotDrink {

	public void drink() {
		System.out.println("drinking coffee");
		
	}

}
