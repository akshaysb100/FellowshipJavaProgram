package com.bridgelabz.jsonprogram.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.jsonprogram.TransactionModel1;
import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class AddressBookMethod {
    
	String personInfo = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/personadd.json";
	
	File file = new File(personInfo);

	AddressBookModel details = new AddressBookModel();
	ArrayList<Person> person = new ArrayList<Person>();
	
	public  void addPerson() throws JsonParseException, JsonMappingException, IOException {
		AddressBookModel tempDetails = new AddressBookModel();
		Person addPerson = new Person();
		Address address = new Address();
		
		//file is empty
         
		 if(file.length()!=0) {
				
			 details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
			}
		 
		 if (!details.getPerson().isEmpty()) {
				person.addAll(details.getPerson());
			}
		
		System.out.println("Enter person information : ");
		System.out.println("Enter first Name : ");
		String firstName = Utility.scanString();
		addPerson.setFirstName(firstName);
		
		System.out.println("Enter lst Name : ");
		String lastName = Utility.scanString();
		addPerson.setLastName(lastName);
		
		System.out.println("Enter Address : ");
		System.out.println("Enter city name  : ");
		String city = Utility.scanString();
		address.setCity(city);
		
		System.out.println("Enter state name : ");
		String state = Utility.scanString();
		address.setState(state);
		
		System.out.println("Enter pin code : ");
		int zip = Utility.scanInt();
		address.setZip(zip);
		
		addPerson.setAddress(address);
		
		//Add person here
		person.add(addPerson);
		
		details.setAdressbook("adressbook1");
		details.setPerson(person);
		
		JsonUtility.writeMapper(personInfo,details);
	}
	
	public void printData() throws JsonParseException, JsonMappingException, IOException {
	    //detele information
		details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
		
		ArrayList<Person> printInfo = new ArrayList<Person>();
		
		File file = new File(personInfo);
		if (file.length() != 0) {
			details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
		}

		if (!details.getPerson().isEmpty()) {
			printInfo.addAll(details.getPerson());
		}
		System.out.println("list size is : "+details.getPerson().size());
		for(int i=0;i<details.getPerson().size();i++) {
			System.out.println("Information of "+(i+1)+" person ");
			System.out.println("First name is : "+details.getPerson().get(i).getFirstName());
			System.out.println("Last name is : "+details.getPerson().get(i).getLastName());
			System.out.println("city name is : "+details.getPerson().get(i).getAddress().getCity());
			System.out.println("state name is : "+details.getPerson().get(i).getAddress().getState());
			System.out.println("pin code is : "+details.getPerson().get(i).getAddress().getZip());
			System.out.println();
		}		
	}
	
	public void searchPerson() throws JsonParseException, JsonMappingException, IOException {
              details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
		
		      ArrayList<Person> printInfo = new ArrayList<Person>();
		
		      File file = new File(personInfo);
		      if (file.length() != 0) {
			  details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
		      }

		       if (!details.getPerson().isEmpty()) {
			        printInfo.addAll(details.getPerson());
		     }
		       int count = 0;
		       boolean flag = true;
		      while(count<2) {
		    	     System.out.println("Enter first name : ");
				     String firstName =  Utility.scanString();
				     System.out.println("Enter last name : ");
				     String lastNmae = Utility.scanString();
				    
				     firstName = firstName.toUpperCase();
				     lastNmae = lastNmae.toUpperCase();
				     
				    //search person information in file
				     String firstName1;
				     String lastNmae1;
				    for(int i=0;i<details.getPerson().size();i++) {
				    	firstName1 = details.getPerson().get(i).getFirstName();
				    	lastNmae1 = details.getPerson().get(i).getLastName();
				    	firstName1 = firstName1.toUpperCase();
				    	lastNmae1 = lastNmae1.toUpperCase();
				    	if(firstName.equals(firstName1) && lastNmae.equals(lastNmae1)){
				    		flag = false;
				    		System.out.println("Information of "+(i+1)+" person ");
							System.out.println("First name is : "+details.getPerson().get(i).getFirstName());
							System.out.println("Last name is : "+details.getPerson().get(i).getLastName());
							System.out.println("city name is : "+details.getPerson().get(i).getAddress().getCity());
							System.out.println("state name is : "+details.getPerson().get(i).getAddress().getState());
							System.out.println("pin code is : "+details.getPerson().get(i).getAddress().getZip());
							System.out.println();
							break;
				    	}
				    }
				    count++;
				    if(flag==false) {
				    	break;
				    }
				    System.out.println("try again....");
		      }
		   
		    if(flag == true) {
		    	System.out.println("no person search in list : ");
		    	System.out.println("If you add person in list : \n");
		    	System.out.println("1. add person : ");
		    	System.out.println("2. exit");
		    	System.out.println("Enter your choice : ");
		    	int choice = Utility.scanInt();
		    	switch (choice) {
				case 1:
					    addPerson();
					break;
				case 2:
					   System.out.println("Exit");
					   break;
				default:
					break;
				}
		    	
		    }
	}
}
