package com.udemy.solid.passportapp.entity;

import java.time.LocalDate;

import com.udemy.solid.passportapp.services.Validity;

/**
 * Our Passport class
 */
public abstract class Passport {

	private Applicant applicant;
	private String passportNumber;
	private LocalDate issueDate;
	private LocalDate expiryDate;
	private Validity validity;
	public Passport(Applicant applicant, String passportNumber,
			String type) {
		super();
		this.applicant = applicant;
		this.passportNumber = passportNumber;

		this.validity = new Validity(type);
		this.issueDate = this.validity.getIssueDate();
		this.expiryDate = this.validity.getExpiryDate();
	}
	public Applicant getApplicant() {
		return applicant;
	}
	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		passportNumber = passportNumber;
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
