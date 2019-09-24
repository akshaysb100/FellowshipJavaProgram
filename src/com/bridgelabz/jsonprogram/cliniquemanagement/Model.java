package com.bridgelabz.jsonprogram.cliniquemanagement;

import java.util.List;

public class Model {
	String  appointment;
	List<Doctor> doctorList;
	List<Patients> patients;
	public String getAppointment() {
		return appointment;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	public List<Doctor> getDoctorList() {
		return doctorList;
	}
	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}
	public List<Patients> getPatients() {
		return patients;
	}
	public void setPatients(List<Patients> patients) {
		this.patients = patients;
	}
	
}
