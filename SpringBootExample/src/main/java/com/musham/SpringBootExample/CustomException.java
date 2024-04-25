package com.musham.SpringBootExample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomException extends RuntimeException {

//	public CustomException(String message) {
//		super("This is Custom Exception message");
//		System.out.println("inside the Custom Exception Constructor");
//	}
	
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> handleArithmeticException(ArithmeticException ex) {
        return new ResponseEntity<>("Arithmetic Exception: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<String> handleCustomException(CustomException ce) {
		return new ResponseEntity<>("Custom Exception: " + ce.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
