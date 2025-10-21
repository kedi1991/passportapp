package com.udemy.solid.passportapp.services;

import org.springframework.stereotype.Service;

import com.udemy.solid.passportapp.interfaces.PassportApplicationSave;

@Service
public class PassportApplicationSaveService implements PassportApplicationSave{

	@Override
	public void saveApplication() {
		System.out.println("Saved application");
		
	}

}
