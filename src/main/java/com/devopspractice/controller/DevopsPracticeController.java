package com.devopspractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsPracticeController {
	@GetMapping(path = "/getMsg")
	public String getOutput() {
		return "Hello 2024";
	}

}
