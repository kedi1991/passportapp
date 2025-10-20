package com.udemy.solid.passportapp.services;

import java.time.LocalDate;

public class Validity {

	private LocalDate issueDate;
	private LocalDate expiryDate;
	private int years;
	
	public Validity(String type ) {
		this.issueDate = LocalDate.now();
		if (type.equals("diplomatic")) {
			years = 4;
		}else if (type.equals("minor")) {
			years = 2;
		}else {
			years = 10;
		}
		this.expiryDate = issueDate.plusYears(years);
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	
	

	
	
}
