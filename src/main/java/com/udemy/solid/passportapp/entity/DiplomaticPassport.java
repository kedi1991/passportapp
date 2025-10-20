package com.udemy.solid.passportapp.entity;

import java.time.LocalDate;

import com.udemy.solid.passportapp.services.Validity;

public class DiplomaticPassport extends Passport{

	public DiplomaticPassport(Applicant applicant, String passportNumber,
			Validity validity) {
		super(applicant, passportNumber, validity);
	
	}

}
