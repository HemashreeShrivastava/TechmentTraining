package com.techment.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalException {
	
	@ExceptionHandler(value = InvalidUserException.class)
	public ResponseEntity<String> myException(InvalidUserException exception) {
		
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.UNAUTHORIZED);
		
	}

	@ExceptionHandler(value = LoanApplicationNotFoundException.class)
	public ResponseEntity<String> myException(LoanApplicationNotFoundException exception) {
		
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.NOT_FOUND);
		
	}
	
	
	@ExceptionHandler(value = LoanApplicationAreadyExistsException.class)
	public ResponseEntity<String> myException(LoanApplicationAreadyExistsException exception) {
		
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.ALREADY_REPORTED);
		
	}
}
