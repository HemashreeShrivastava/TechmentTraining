package com.techment.Core;

public class Bank {
	String name;
	String ifseCode;
	String branch;
	public void setName(String name) {
		this.name = name;
	}
	public void setIfseCode(String ifseCode) {
		this.ifseCode = ifseCode;
	}
	
	Bank(String branch)
	{
		this.branch=branch;
	}
	public void displayBankDetail()
	{
		System.out.println("Name"+" "+name);
		System.out.println("IfseCode"+" "+ifseCode
				);
		System.out.println("branch"+" "+branch);
	
	
	}

}
