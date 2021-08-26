package com.techment.modal;

import java.util.List;

public class Restraunt {
	String restrauntName;
	IHotDrink hotDrink;
	ISoftDrink iSoftDrink;
	List<String> employeeName;
	/*Tea tea;*/
	public void displayRestrauntDetails()
	{
		System.out.println("restraunt name"+" "+restrauntName);
		hotDrink.drink();
		iSoftDrink.drin();
		System.out.println("list of employee"+ employeeName);
		
		//System.out.println("price of tea"+" "+tea.price);
		//tea.msg();
	}
	public void setEmployeeName(List<String> employeeName) {
		this.employeeName = employeeName;
	}
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}
	public void setiSoftDrink(ISoftDrink iSoftDrink) {
		this.iSoftDrink = iSoftDrink;
	}
	public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
		
	}
	/*public void setTea(Tea tea) {
		this.tea = tea;
	}*/
}
