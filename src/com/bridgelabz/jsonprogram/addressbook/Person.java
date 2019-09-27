/******************************************************************************
 *  Purpose: person information and pojo class 
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jsonprogram.addressbook;

public class Person {
	
   private String firstName;
   private String lastName;
   private String mobileNumber;
   private Address address;
   
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
   
}
