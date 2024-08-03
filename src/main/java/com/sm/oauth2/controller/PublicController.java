package com.sm.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/public")
@RestController
public class PublicController {
	
	@GetMapping("/get")
	public String get() {
		return  "<h2>public endpoint</h2>";
	}

}
