package com.udemy.solid.passportapp.controllers;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.solid.passportapp.entity.Applicant;
import com.udemy.solid.passportapp.entity.DiplomaticPassport;
import com.udemy.solid.passportapp.entity.Passport;
import com.udemy.solid.passportapp.services.Validity;

@RestController
public class ValidityController {

	@GetMapping("/passport")
	public Passport getPassport() {
		return new Passport(new Applicant("test", "test 2", LocalDate.of(1990, Month.APRIL, 9), "test 3"), "UG098857575", new Validity(LocalDate.now()));
	}
	
	@GetMapping("/diplomatic")
	public Passport getDPassport() {
		return new DiplomaticPassport(new Applicant("test_displomatic", "test 2", LocalDate.of(1990, Month.APRIL, 9), "test 3"), "UGDP000005", new Validity(LocalDate.now()));
	}
}
