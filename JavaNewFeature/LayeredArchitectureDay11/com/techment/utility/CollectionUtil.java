package com.techment.utility;

import java.util.*;

import com.techment.model.Employee;

public class CollectionUtil {
	static Map<Integer,Employee> employees=new HashMap<Integer,Employee>();

	static
	{
		employees.put(1,new Employee(1,"john","hr",3400));
		employees.put(2,new Employee(2,"jiva","Software",3000));
		employees.put(3,new Employee(1,"Shiva","Sales",34000));
		employees.put(4,new Employee(1,"Mia","hr",4500));
	}
	public static Map<Integer,Employee> getEmployeeList()
	{
		return employees;
	}
}
