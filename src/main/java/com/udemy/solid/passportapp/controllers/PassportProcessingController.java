package com.udemy.solid.passportapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.solid.passportapp.interfaces.PassportApplicationInitialize;

@RestController
@RequestMapping("/application")
public class PassportProcessingController {
	
	private final PassportApplicationInitialize passportApplicationInitialize;

	public PassportProcessingController(PassportApplicationInitialize passportApplicationInitialize) {
	
		this.passportApplicationInitialize = passportApplicationInitialize;
	}



	@GetMapping("/init")
	public ResponseEntity<String> init(){
		passportApplicationInitialize.initApplication();
		return ResponseEntity.ok("Application Initialized.");
	}
}
