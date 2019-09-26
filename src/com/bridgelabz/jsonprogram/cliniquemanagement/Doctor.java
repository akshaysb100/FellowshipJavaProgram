/******************************************************************************
 *  Purpose: Doctor information and thats methods
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jsonprogram.cliniquemanagement;

public class Doctor {
	private String doctorName;
	private String Specialization;
	private String amPM;
	private int id;
	private int newNumber;
	private int odlNumber;
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getAmPM() {
		return amPM;
	}
	public void setAmPM(String amPM) {
		this.amPM = amPM;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNewNumber() {
		return newNumber;
	}
	public void setNewNumber(int newNumber) {
		this.newNumber = newNumber;
	}
	public int getOdlNumber() {
		return odlNumber;
	}
	public void setOdlNumber(int odlNumber) {
		this.odlNumber = odlNumber;
	}
	
}
