package com.demo.pipeline.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	@GetMapping("/msg")
	public String showMsg() {
		return "this is demo project..!";
	}

}
