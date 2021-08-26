package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restraunt {
	
	String restrauntName;
	@Autowired
	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

	@Autowired@Qualifier("milk")
	IHotDrink iHotDrink;
	@Autowired@Qualifier("mazza")
	ISoftDrink iSoftDrink;
	
	public void displayRestrauntDetails()
	{
		System.out.println("welcome to "+" "+restrauntName);
		iHotDrink.drink();
		iSoftDrink.drink();
	}
	
}
