package com.udemy.solid.passportapp.services;

import org.springframework.stereotype.Service;

import com.udemy.solid.passportapp.interfaces.PassportApplicationSubmit;

@Service
public class PassportApplicationSubmitService implements PassportApplicationSubmit{

	@Override
	public void submitApplication() {
		System.out.println("Application submitted!.");
		
	}

}
