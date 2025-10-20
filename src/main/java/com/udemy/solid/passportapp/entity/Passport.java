package com.udemy.solid.passportapp.entity;

import java.time.LocalDate;

public abstract class Passport {
	/**
	 * Our Passport class
	 */

	private Applicant applicant;
	private String PassportNumber;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	
}
