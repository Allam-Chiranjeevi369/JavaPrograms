package com.springBootPro.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/firstCode")
	public String helloWorld() {
		
		return "Hello Spring!!!";
		
	}
	
}
