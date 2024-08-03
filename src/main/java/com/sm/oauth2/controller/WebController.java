package com.sm.oauth2.controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WebController {
	
	@GetMapping("/token/api")
	public String get(@AuthenticationPrincipal Jwt jwt) {
		Map<String,Object>claims = jwt.getClaims();
		
		String email = claims.get("preferred_username").toString();
		System.out.println("email : "+email);
		
		return "<h2> secured endpoint ! </h2>";
	}

}
