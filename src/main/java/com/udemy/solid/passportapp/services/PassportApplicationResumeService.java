package com.udemy.solid.passportapp.services;

import org.springframework.stereotype.Service;

import com.udemy.solid.passportapp.interfaces.PassportApplicationResume;

@Service
public class PassportApplicationResumeService implements PassportApplicationResume{

	@Override
	public void resumeApplication() {
		System.out.println("Resuming application");
		
	}

}
