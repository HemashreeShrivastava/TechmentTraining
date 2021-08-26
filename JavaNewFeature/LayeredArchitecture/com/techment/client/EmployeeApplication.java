package com.techment.client;
import java.util.List;
import java.util.Scanner;

import com.techment.model.Employee;
import com.techment.service.EmployeeSeviceImpl;
import com.techment.service.IEmployeeService;
public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSeviceImpl service = new EmployeeSeviceImpl(); 
		System.out.println("==========Employee Application======");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id to fecth");
		int id = scanner.nextInt();
		Employee employee = service.getEmployeeById(id);
System.out.println(employee);
		
		
		System.out.println("Enter the dept to fetch employee");
		String dept = scanner.next();
		
		List<Employee> employees = service.getEmployeeByDept(dept);
		System.out.println(employees);
		
		
		
		

	}

}
