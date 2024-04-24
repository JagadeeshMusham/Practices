package com.musham.SpringBootExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	/**
	 * 
	 * @param request
	 * @return
	 * 
	 *         the URL: localhost:8080 request Body: { "num1": 5, "num2": 3 }
	 */
	@PostMapping
	public int calculateSum(@RequestBody SumRequest request) {
		return request.getNum1() + request.getNum2();
	}

	@GetMapping("/{num1}/{num2}")
	public String calculateSum(@PathVariable int num1, @PathVariable int num2) {
		return "the sum is: " + (num1 + num2);
	}

	@GetMapping("/sum")
	public String calculateSumWithRequestParam(@RequestParam("num1") int value1, @RequestParam("num2") int value2) {
		return "the sum is: " + (value1 + value2);
	}

}
