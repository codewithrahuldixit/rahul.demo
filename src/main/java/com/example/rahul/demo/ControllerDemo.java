package com.example.rahul.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
