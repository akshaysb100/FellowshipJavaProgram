package com.bridgelabz.jsonprogram.addressbook;

import java.util.List;

public class AddressBookModel {
   
	private String adressbook;
	private List<Person> person;
	
	public String getAdressbook() {
		return adressbook;
	}
	public void setAdressbook(String adressbook) {
		this.adressbook = adressbook;
	}
	public List<Person> getPerson() {
		return person;
	}
	public void setPerson(List<Person> person) {
		this.person = person;
	}
	
	
}
