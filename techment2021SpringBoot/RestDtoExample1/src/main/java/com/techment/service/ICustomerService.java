package com.techment.service;

import java.util.List;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;

public interface ICustomerService {
	
	String addCustomer(CustomerDto customerdto);
	List<CustomerDto> viewAllCustomer();
	Customer viewCustomerById(int id);
	String deleteById(int id);
	String updateById(int id);
}
