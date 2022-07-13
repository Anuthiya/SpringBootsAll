package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/Hi")
	public String getHi() {
		return "Hello World";
	}
	@RequestMapping("/Sum/{a}/{b}")
	public int findSum(@PathVariable int a,@PathVariable int b) {
		int c=a+b;
		return c;
		
	}
	@RequestMapping("/OddEven/{a}")
	public String findOddEven(@PathVariable int a) {
		if(a%2==0) {
			return "EVEN";
		}
		else {
			return "ODD";
		}
		}
	
	
	@GetMapping("/findDivid/{a}/{b}")
	public int findDivid(@PathVariable int a, @PathVariable int b) {
		int c=a/b;
		return c;
	}
	
	
}

	
