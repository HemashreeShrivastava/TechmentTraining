package com.techment.service;

import com.tectment.dao.IEmployeeDao;

import java.util.List;

import com.techment.model.Employee;
import com.tectment.dao.EmployeeDao;

public class EmployeeSeviceImpl implements IEmployeeDao {

	IEmployeeDao employeeDao = new EmployeeDao();

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByDept(dept);
	}
}
