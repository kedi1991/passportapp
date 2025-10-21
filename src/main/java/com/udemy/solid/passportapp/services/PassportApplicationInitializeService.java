package com.udemy.solid.passportapp.services;

import org.springframework.stereotype.Service;

import com.udemy.solid.passportapp.interfaces.PassportApplicationInitialize;
import com.udemy.solid.passportapp.interfaces.PassportApplicationSave;

@Service
public class PassportApplicationInitializeService implements PassportApplicationInitialize, PassportApplicationSave {

	@Override
	public void saveApplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initApplication() {
		System.out.println("Here at the init method");
		
	}
		
	}

