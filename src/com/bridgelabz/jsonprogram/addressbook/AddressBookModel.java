package com.bridgelabz.jsonprogram.addressbook;

import java.util.List;

public class AddressBookModel {
   
	private String state;
	private List<Person> person;
	
	public String getAdressbook() {
		return state;
	}
	public void setAdressbook(String adressbook) {
		this.state = adressbook;
	}
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
	}
	
	
}