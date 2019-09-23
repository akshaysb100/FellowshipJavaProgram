package com.bridgelabz.jsonprogram.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class AdressBooktemp {

	String personInfo = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/state.json";
	
	File file = new File(personInfo);
  //  AddSate detail = new AddSate();
    
	//AddressBookModel details = new AddressBookModel();
	//ArrayList<Person> person = new ArrayList<Person>();
	ArrayList<AddressBookModel> addbook = new ArrayList<AddressBookModel>();
	
	
	
	AddSateAddressbook newSate = new AddSateAddressbook();
	ArrayList<Person> person = new ArrayList<Person>();
	ArrayList<StateModel> state = new ArrayList<StateModel>();
	
	public void addState() throws JsonParseException, JsonMappingException, IOException {
		StateModel addSate = new StateModel();
		Person addPerson = new Person();
		Address address = new Address();
		if(file.length()!=0) {
			
			newSate = (AddSateAddressbook) JsonUtility.readMapper(personInfo, newSate);
			}
		 
		 if (!newSate.getStateModel().isEmpty()) {
			    state.addAll(newSate.getStateModel());
			}
		    
		    System.out.println("Enter state name");
		    String stateName = Utility.scanString();
		    String newsatename = stateName;
 		    boolean flag=true;
		   // addSate.setState(stateName);
		    int size=0;
		    for(int i=0;i<newSate.getStateModel().size();i++) {
		    	System.out.println(newSate.getStateModel().get(i).getState());
		    	 if(newsatename.equals(newSate.getStateModel().get(i).getState())) {
				    	flag = false;
			            newsatename = 	addSate.getState();    	
			            System.out.println("data : ");
			            size=i;
			            break;
				    }
		    	
		    }
		    if(flag==true) {
		    //	System.out.println("Add state : ");
		    	 addSate.setState(newsatename);
		    	 System.out.println("Enter Adress book : ");
					System.out.println("Enter first Name : ");
					String firstName = Utility.scanString();
					addPerson.setFirstName(firstName);
					
					System.out.println("Enter last Name : ");
					String lastName = Utility.scanString();
					addPerson.setLastName(lastName);
					
					System.out.println("Enter Address : ");
					System.out.println("Enter city name  : ");
					String city = Utility.scanString();
					address.setCity(city);
					
				    System.out.println("Enter state name : ");
					//String state = Utility.scanString();
					address.setState(stateName);;
					
					System.out.println("Enter pin code : ");
					int zip = Utility.scanInt();
					address.setZip(zip);
					
					addPerson.setAddress(address);
					person.add(addPerson);
					addSate.setPerson(person);
					state.add(addSate);
					//state.get(1).setPerson(person);
				    newSate.setStateModel(state);
				   
				   
		    }else if(flag==false) {
		    	    System.out.println("Enter Adress book : ");
					System.out.println("Enter first Name : ");
					String firstName = Utility.scanString();
					addPerson.setFirstName(firstName);
					
					System.out.println("Enter last Name : ");
					String lastName = Utility.scanString();
					addPerson.setLastName(lastName);
					
					System.out.println("Enter Address : ");
					System.out.println("Enter city name  : ");
					String city = Utility.scanString();
					address.setCity(city);
					
				    System.out.println("Enter state name : ");
					//String state = Utility.scanString();
					address.setState(newsatename);;
					
					System.out.println("Enter pin code : ");
					int zip = Utility.scanInt();
					address.setZip(zip);
					
					addPerson.setAddress(address);
					person.add(size,addPerson);
					addSate.setPerson(person);
					state.add(addSate);
					newSate.setStateModel(state);
				   
		    }
		  //  addSate.setPerson(person);
		   // addSate.setState(newsatename);
		    JsonUtility.writeMapper(personInfo,newSate);
	}
	
	/*
	public  void addSate() throws JsonParseException, JsonMappingException, IOException {
		 
		AddressBookModel addSate = new AddressBookModel();
		
		  
		 if(file.length()!=0) {
				
			 detail = (AddSate) JsonUtility.readMapper(personInfo, detail);
			}
		 
		 if (!detail.getAddressBookModel().isEmpty()) {
			  addbook.addAll(detail.getAddressBookModel());
			}
		    
		    System.out.println("Enter state name");
		    String stateName = Utility.scanString();
		    addSate.setAdressbook(stateName);
		    
		    addbook.add(addSate);
		    detail.setAddressBookModel(addbook);
		    JsonUtility.writeMapper(personInfo,detail);
		
		
	}

	
	public void print() {
		
	}
	public void setPerson() throws JsonParseException, JsonMappingException, IOException {
		//AddressBookModel tempDetails = new AddressBookModel();
		Person addPerson = new Person();
		Address address = new Address();
		AddressBookModel addbook1 = new AddressBookModel();
		//file is empty
         
		 if(file.length()!=0) {
				
			 detail = (AddSate) JsonUtility.readMapper(personInfo, detail);
			}
		 
//		 if (!newAddressBook.getAddressbook1().isEmpty()) {
//			 addbook.addAll(newAddressBook.getAddressbook1());
//			}
		 System.out.println("Enter state name : ");
			String state = Utility.scanString();
			System.out.println("size"+detail.getAddressBookModel().size());
			int size =detail.getAddressBookModel().size();
		for(int i=0;i<size;i++) {
			System.out.println(detail.getAddressBookModel().get(i).getAdressbook());
			System.out.println(i);
			if(state.equals(detail.getAddressBookModel().get(i).getAdressbook())) {
				
			
				System.out.println("Enter Adress book : ");
				System.out.println("Enter first Name : ");
				String firstName = Utility.scanString();
				addPerson.setFirstName(firstName);
				
				System.out.println("Enter last Name : ");
				String lastName = Utility.scanString();
				addPerson.setLastName(lastName);
				
				System.out.println("Enter Address : ");
				System.out.println("Enter city name  : ");
				String city = Utility.scanString();
				address.setCity(city);
				
			//	System.out.println("Enter state name : ");
				//String state = Utility.scanString();
				address.setState(state);
				
				System.out.println("Enter pin code : ");
				int zip = Utility.scanInt();
				address.setZip(zip);
				
				addPerson.setAddress(address);
				
				//Add person here
				person.add(addPerson);
				addbook1.setPerson(person);
				addbook1.setAdressbook(state);
				addbook.add(addbook1);
				detail.setAddressBookModel(addbook);;
				detail.setAddressbook12("state");
				//JsonUtility.writeMapper(personInfo,detail);
				
				
			}
			   //if((i+1)!=posi)
			 if (!detail.getAddressBookModel().isEmpty()) {
				  addbook.addAll(detail.getAddressBookModel());
				}
			  
		}
		JsonUtility.writeMapper(personInfo,detail);
	}
	/*
	public  void addAddressBook() throws JsonParseException, JsonMappingException, IOException {
		AddressBookModel tempDetails = new AddressBookModel();
		Person addPerson = new Person();
		Address address = new Address();
		
		//file is empty
         
		 if(file.length()!=0) {
				
			 newAddressBook = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
			}
		 
		 if (!newAddressBook.getPerson().isEmpty()) {
				person.addAll(newAddressBook.getPerson());
			}
		
		System.out.println("Enter Adress book : ");
		System.out.println("Enter first Name : ");
		String firstName = Utility.scanString();
		addPerson.setFirstName(firstName);
		
		System.out.println("Enter last Name : ");
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
	public void sortAddressbook() throws JsonParseException, JsonMappingException, IOException {
		 details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
			
	      ArrayList<Person> printInfo = new ArrayList<Person>();
	
	      File file = new File(personInfo);
	      if (file.length() != 0) {
		  details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
	      }

	       if (!details.getPerson().isEmpty()) {
		        printInfo.addAll(details.getPerson());
	     }
	       String name ="";
	      
	}
	public void deletefile(int position) throws JsonParseException, JsonMappingException, IOException {
		 details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);

		     ArrayList<Person> printInfo = new ArrayList<Person>();

		     File file = new File(personInfo);
		     if (file.length() != 0) {
		 details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
		     }

		      if (!details.getPerson().isEmpty()) {
		       printInfo.addAll(details.getPerson());
		    }
		     // printData();
		      //System.out.println("enter Id number which one you deleted : ");
		      int pos = position;
		      for(int i=0;i<details.getPerson().size();i++) {
		      if((i+1)==pos) {
		      details.getPerson().remove(i);
		     // System.out.println(i);
		      }
		      if((i+1)!=pos) {
		      if (!details.getPerson().isEmpty()) {
		         printInfo.addAll(details.getPerson());
		      }
		      }
		     
		      }
		      JsonUtility.writeMapper(personInfo,details);
		}
    */
}
