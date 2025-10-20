package com.udemy.solid.passportapp.entity;

import java.time.LocalDate;

public class Applicant {
	/*
	 * Our applicant details
	 */

	private String fName;
	private String lName;
	private LocalDate doB;
	private String ssName;
	//deledt all here ---
	public Applicant(String fName, String lName, LocalDate doB, String ssName) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.doB = doB;
		this.ssName = ssName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public LocalDate getDoB() {
		return doB;
	}
	public void setDoB(LocalDate doB) {
		this.doB = doB;
	}
	public String getSsName() {
		return ssName;
	}
	public void setSsName(String ssName) {
		this.ssName = ssName;
	}
	
	
}
