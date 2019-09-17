package com.bridgelabz.jsonfile;

public class Person {

	private String mobileNumber;
	private int age;
	private String city;
	private Employee employee;
	public Person() {}
	public Person(String mobileNumber,int age,String city,Employee employee) {
		this.age=age;
		this.city=city;
		this.employee=employee;
		this.mobileNumber=mobileNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
}
