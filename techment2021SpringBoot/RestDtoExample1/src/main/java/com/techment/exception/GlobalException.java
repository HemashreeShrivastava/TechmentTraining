package com.techment.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
		@ExceptionHandler(value = IDNotFoundException.class)
		public ResponseEntity<Object> myException(IDNotFoundException exception) {
			return new ResponseEntity<Object>(exception.getMag(),HttpStatus.NOT_FOUND);
		}
	
	/*@ExceptionHandler(value=EmployeeException)
	public ResponseEntity<String> myEmployeeException(EmployeeException exception)
	{
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.BAD_REQUEST);
	}*/
		public ResponseEntity<List<String>> myValidationException(ValidationException exception)
		{
			return new ResponseEntity<List<String>>(exception.getMessages(),HttpStatus.BAD_REQUEST);
		}
	
}
