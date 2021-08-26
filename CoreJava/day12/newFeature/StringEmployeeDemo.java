package com.techment.day12.newFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees =new ArrayList<Employee>();
		employees.add(new Employee(1,"hina","hr",30000,18));
		employees.add(new Employee(2,"nia","hr",20000,18));
		employees.add(new Employee(3,"sarfarash","manager",20000,18));
		employees.add(new Employee(4,"safan","sales",23440,34));
		employees.add(new Employee(5,"sourabh","developer",2700,27));
        
		Long empcount = employees.stream().count();
		System.out.println("the total number of employee"+empcount);
		
		Long devcount=employees.stream().filter(e->e.getDept().equals("developer")).count();
		System.out.println("the total number of employee"+devcount);
		employees.stream().filter(e->e.getDept().equals("developer")).forEach(e->System.out.println("name of developer"+e));
		List<Employee>emp=employees.stream().filter(e->e.getDept().equals("developer")).collect(Collectors.toList());
		System.out.println(emp);
		
		
		Long numberOfEmploee= employees.stream().collect(Collectors.counting());
		System.out.println("total no of"+numberOfEmploee);
		
		
		
		Long totalSalary=employees.stream().collect(Collectors.summingInt(Employee::getSalary)).getSum();
		
		StringEmployeeDemo obj = new StringEmployeeDemo();
		obj.filterByDept(employees,"developer");
	
		System.out.println(emp);
	}
	
	List filterByDept (ArrayList<Employee> empList,String dept)
	{
		List<Employee>emp=	empList.stream().filter(e->e.getDept().equals("developer")).collect(Collectors.toList());

		return emp;
		
	}

}
