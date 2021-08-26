package com.techment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.Employee;
import com.techment.dao.IDao;

@Service("dbservices")
public class DatabaseService {
	@Autowired
	@Qualifier("mySql")
	IDao dao;
	@Autowired
	Employee emp;
	public void displayDatabase()
	{
		dao.databaseName();
		emp.displayEmployeeInfo();
		
	}
}
