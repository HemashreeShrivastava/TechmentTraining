package com.techment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerDao Dao;
	
	@Override
	public String addCustomer(CustomerDto customerdto) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setName(customerdto.getName());
		customer.setAddress(customerdto.getAddress());
		customer.setAge(customerdto.getAge());
		customer.setEmail(customerdto.getEmail());
		Dao.save(customer);
		return "Hello";
	}

	@Override
	public List<CustomerDto> viewAllCustomer() {
		// TODO Auto-generated method stub
		List<Customer> customers = Dao.findAll();
		
		List<CustomerDto> customerDto = new ArrayList<CustomerDto>();
		
		for(Customer c : customers) {
			
//			customerDto.add(new CustomerDto(c.getId(),c.getName(), c.getMobile()));
			
			customerDto.add(new CustomerDto(c.getId(),c.getName(),c.getAge()));
		}
		
		return customerDto;
	}

	@Override
	public Customer viewCustomerById(int id) throws NoSuchElementException {
		// TODO Auto-generated method stub
		return Dao.findById(id).get();
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		Dao.deleteById(id);
		return "deleted";
		
	}

	@Override
	public String updateById(int id) {
		// TODO Auto-generated method stub
		Customer customer =Dao.findById(id).get();
		customer.setAge(10);
		
		
		return "updated";
	}
	
	

}
