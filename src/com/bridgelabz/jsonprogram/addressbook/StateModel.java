package com.bridgelabz.jsonprogram.addressbook;

import java.util.List;

public class StateModel {
	
	private String state;
	private List<Person> person;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
	}
	
	
}
