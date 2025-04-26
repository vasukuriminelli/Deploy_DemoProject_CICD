package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/get")
	public String getData()
	{	
		System.out.println("Hello");
		return "THIS IS FIRST DEPLOYMED PROJECT THROUGH CICD_CONCEPT";
	}

}
