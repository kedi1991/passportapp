package com.udemy.solid.passportapp.controllers;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.solid.passportapp.entity.Applicant;
import com.udemy.solid.passportapp.entity.DiplomaticPassport;
import com.udemy.solid.passportapp.entity.MinorPassport;
import com.udemy.solid.passportapp.entity.Passport;
import com.udemy.solid.passportapp.services.Validity;

@RestController
public class PassportController {

	@GetMapping("/minor")
	public Passport getMinorPassport(@RequestParam String type) {
		return new MinorPassport(new Applicant("Minor", "test 2", LocalDate.of(1990, Month.APRIL, 9), "test 3"), "UG098857575", type);
	}
	
	@GetMapping("/diplomatic")
	public Passport getDiplomaticPassport(@RequestParam String type) {
		return new DiplomaticPassport(new Applicant("test_displomatic", "test 2", LocalDate.of(1990, Month.APRIL, 9), "test 3"), "UGDP000005", type);
	}
	@GetMapping("/ordinary")
	public Passport getOrdinaryPassport(@RequestParam String type) {
		return new DiplomaticPassport(new Applicant("ordinary", "test 2", LocalDate.of(1990, Month.APRIL, 9), "test 3"), "UG4594940", type);
	}
}
