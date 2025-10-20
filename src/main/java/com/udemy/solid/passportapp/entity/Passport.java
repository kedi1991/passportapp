package com.udemy.solid.passportapp.entity;

import java.time.LocalDate;

import com.udemy.solid.passportapp.services.Validity;

/**
 * Our Passport class
 */
public class Passport {

	private Applicant applicant;
	private String PassportNumber;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	private Validity validity;
	public Passport(Applicant applicant, String passportNumber,
			Validity validity) {
		super();
		this.applicant = applicant;
		PassportNumber = passportNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.validity = validity;
	}
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public String getPassportNumber() {
		return PassportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		PassportNumber = passportNumber;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Validity getValidity() {
		return validity;
	}
	public void setValidity(Validity validity) {
		this.validity = validity;
	}
	
	
	
}
