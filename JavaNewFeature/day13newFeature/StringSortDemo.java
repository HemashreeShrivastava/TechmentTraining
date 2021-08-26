package com.techment.day13newFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import com.techment.day12.newFeature.Employee;

class AgeComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
		return 0;
		else if (o2.getId()>o2.getId())
			return 1;
		return -1;
		
	}
	}
public class StringSortDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Krishna","Hr",20000,18));
		employees.add(new Employee(2,"Aman","Developer",30000,20));
		employees.add(new Employee(3,"Jasmine","Secretary",40000,38));
		employees.add(new Employee(4,"Rahul","Developer",25000,27));
		employees.add(new Employee(5,"Mohit","Hr",15000,30));
		
		employees.forEach(System.out::println);
		
		System.out.println("===========================================================================");
		System.out.println("After sorting:");
		employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
		
		System.out.println("===========================================================================");
		System.out.println("After  Age sorting:");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
		
		System.out.println("===========================================================================");
		System.out.println("After reversed Age sorting:");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println);
		
		
		System.out.println("===========================================================================");
		System.out.println("By using comparator Age sorting:");
		List<Employee> emp =	employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	
		emp.forEach(System.out::println);
		
		Map<String, List<Employee>> resultSet= employees.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(resultSet);
	
	}

}
