package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("simple")
public class SimpleController {

	@GetMapping(value = "")
	public String sayHello() {
		return "Welcome to spring rest api created by Adriana!";
	} 
}
