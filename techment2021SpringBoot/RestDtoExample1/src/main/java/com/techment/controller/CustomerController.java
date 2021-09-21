package com.techment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exception.IDNotFoundException;
import com.techment.exception.ValidationException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value="/customerController")
public class CustomerController {

	@Autowired
	ICustomerService iCustomerService;
	
	
	@GetMapping("/viewAll")
	public List<CustomerDto> viewCustomer()
	{
		return iCustomerService.viewAllCustomer();
	}
	@PostMapping(value="/insertCustomer")
	public String addNewCustomer(@RequestHeader String token ,@Valid @RequestBody CustomerDto customerDto,BindingResult bindingResult) throws MethodArgumentNotValidException
	{
		if(bindingResult.hasErrors())
		{
			System.out.println("error occured");
			List<FieldError> fieldError=bindingResult.getFieldErrors();
			List<String>errorList = new ArrayList<String>();
			for(FieldError f: fieldError)
			{
				errorList.add(f.getDefaultMessage());
			}
			throw new ValidationException();
		}

		iCustomerService.addCustomer(customerDto);
		return "Inserted";
	}
	
	@GetMapping(value="/customerById/{id}")
	public Customer getById(@PathVariable int id)
	{
//		CustomerDto customer= iCustomerService.viewCustomerById(id);
//		return customer;
		try {
			Customer customer= iCustomerService.viewCustomerById(id);
		return customer;
		 } 
		catch (Exception ex) 
		{
			throw new IDNotFoundException("NO id present to get it");
		}
	}
	@GetMapping(value="/deleteById/{id}")
	public String deleteById(@PathVariable int id)
	{
		try {
		iCustomerService.deleteById(id);
		return "deleted";
		}
		catch(Exception ex)
		{
			throw new IDNotFoundException("NO id present to get it");
		}
		}
	@GetMapping(value="/updateById/{id}")
	public String updateById(@PathVariable int id)
	{
		try {
		iCustomerService.updateById(id);
		return "updated";
		}
		catch(Exception ex)
		{
			throw new IDNotFoundException("NO id present to get it");
		}
		}
	
	@ExceptionHandler(value = IDNotFoundException.class)
	public ResponseEntity<Object> myException(IDNotFoundException exception){
		return new ResponseEntity<Object>(exception.getMag(), HttpStatus.NOT_FOUND);
	}
	
	
}