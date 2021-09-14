package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.LoanApplicationDto;
import com.techment.entity.LoanApplication;
import com.techment.exception.LoanApplicationNotFoundException;
import com.techment.service.ILoanApplicationService;

@RestController
@RequestMapping(value="/loanApplicationController")
public class LoanApplicationController {
	@Autowired
	ILoanApplicationService applicationService;
	
	@GetMapping("/viewAll")  
	private List<LoanApplication> getAllLoanApplication()   
	{  
	return applicationService.getAllLoanApplication();
	}  

	@PostMapping("/saveLoanApplication")  
	private String saveLoanApplication(@RequestBody LoanApplicationDto loanApplicationDto)   
	{  
	applicationService.saveLoanApplication(loanApplicationDto);
	return "inserted";  
	}  
	@PutMapping("/approveLoanApplication/{id}")
	
	private ResponseEntity approveLoanApplication(@PathVariable int id) {
	   try
	   {
		applicationService.approveLoanApplication(id) ;
		
		return new ResponseEntity(applicationService.approveLoanApplication(id), HttpStatus.OK);
		
	   }
	   catch(LoanApplicationNotFoundException loanApplicationNotFoundException)
	   {
		   return new ResponseEntity("Application id does not found", HttpStatus.CONFLICT);
	   }
	}
	@PutMapping("/rejectLoanApplication/{id}")
	private ResponseEntity rejectLoanApplication(@PathVariable int id)
	{
		try {
		applicationService.rejectLoanApplication(id);
		
		return new ResponseEntity(applicationService.rejectLoanApplication(id), HttpStatus.OK);
		
		}
		catch(LoanApplicationNotFoundException loanApplicationNotFoundException)
		{
			return new ResponseEntity("Application id does not found", HttpStatus.CONFLICT);
			   
		}
	}
	
}
