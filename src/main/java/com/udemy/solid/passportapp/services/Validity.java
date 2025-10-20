package com.udemy.solid.passportapp.services;

import java.time.LocalDate;

public class Validity {

	private LocalDate issueDate;
	private LocalDate expiryDate;
	
	public Validity(LocalDate issueDate) {
		this.issueDate = issueDate;
		this.expiryDate = issueDate.plusYears(10);
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	
	

	
	
}
