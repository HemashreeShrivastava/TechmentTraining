package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//<beab id="employee" class="com.techment.Employee"></bean>
public class Employee {
	@Autowired
	Address address;
	public void display()
	{
		address.AddressDetails();
	}
}
