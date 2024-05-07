package com.musham.SpringBootExample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

	/**
	 * 				@RequestBody:
	 * This annotation binds the HTTP request body to a parameter in the method. 
	 * It's commonly used with POST and PUT requests to receive complex data in JSON or XML format.
	 * 
	 * 
	 * @param request
	 * @return
	 * 
	 * The URL: localhost:8080/v1
	 * The Request Body: { "num1": 5, "num2": 3 }
	 */
	@PostMapping
	public int calculateSum(@RequestBody SumRequest request) {
		System.out.println("The SumRequest");
		return request.getNum1() + request.getNum2();
	}

	/**
	 * @RequestBody:
	 * 
	 * 
	 * @param request
	 * @return
	 * 
	 * The URL: localhost:8080/v1
	 * The Request Body: [5, 8]
	 */
	@PostMapping("/sum")
	public int calculateSumWithArrayInput(@RequestBody int[] request) {
		System.out.println("Array Int");
		return request[0] + request[1];
	}
	
	
	
	/**
	 * 				@PathVariable:
	 * This annotation is used to extract data from the URI template (part of the URL path) itself. 
	 * It's used to capture a part of the URL path and use it as a method parameter.
	 * 
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 * 
	 * The URL: localhost:8080/v1/5/6
	 */
	@GetMapping("/{num1}/{num2}")
	public String calculateSum(@PathVariable int num1, @PathVariable int num2) {
		System.out.println("Path Variable");
		return "the sum is: " + (num1 + num2);
	}

	/**
	 * 				@RequestParam:
	 * This annotation is used to extract data from the query parameters of the request URL.
	 * It's typically used with GET requests to retrieve parameters sent in the URL.
	 * 
	 * @param value1
	 * @param value2
	 * @return
	 * 
	 * The URL: localhost:8080/v1/sum?num1=5&num2=9
	 */
	@GetMapping("/sum")
	public String calculateSumWithRequestParam(@RequestParam("num1") int value1, @RequestParam("num2") int value2) {
		System.out.println("Request Param");
		return "the sum is: " + (value1 + value2);
	}
	
	/**
	 * 				@RequestHeader: 
	 * This annotation is used to extract values from HTTP headers of the request
	 * 
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 * 
	 * The URL: localhost:8080/v1/
	 * 
	 */
	@GetMapping("/SumWithHeaders")
    public int calculateSumWithHeaders(@RequestHeader("header1") int num1, @RequestHeader("header2") int num2) {
		System.out.println("Request Header");
        return num1 + num2;
    }

	/**
	 * @param value1
	 * @param value2
	 * @return
	 */
	@GetMapping("/devide")
	public ResponseEntity<String> CalculateDivision(@RequestParam int value1, @RequestParam int value2) {
		return new ResponseEntity<>("The division value is: " + value1 / value2, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * @return
	 */
	@DeleteMapping
	public String delete()
	{
		System.out.println("This is to test Custom exception");
		throw new CustomException();
	}
}
