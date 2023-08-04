package com.example.rahul.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
}
