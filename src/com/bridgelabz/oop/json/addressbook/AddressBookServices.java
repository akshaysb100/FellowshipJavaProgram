/******************************************************************************
 *  Purpose: All Address book method
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.oop.json.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class AddressBookServices {
    
	//String personInfo = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/personadd.json";
	//String personInfo="";
//	File file = new File(personInfo);
	String addreeBookPathPath ="";
	
	AddressBookModel details = new AddressBookModel();
	ArrayList<Person> person = new ArrayList<Person>();
	
	Person addPerson = new Person();
	Address address = new Address();

	public  void addPerson(String addreeBookPathPath,String newAddressbook) throws JsonParseException, JsonMappingException, IOException {
		
		//file is empty
		File file = new File(addreeBookPathPath);     
		if(file.length()!=0) {

		details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
		person.clear();
		}

		if (!details.getPerson().isEmpty()) {
		person.addAll(details.getPerson());
		}

		
		System.out.println("Enter person information : ");
		System.out.println("Enter first Name : ");
		String firstName = Utility.scanString();
		addPerson.setFirstName(firstName);

		System.out.println("Enter last Name : ");
		String lastName = Utility.scanString();
		addPerson.setLastName(lastName);
		
		System.out.println("Enter Mobile number : ");
		String mobileNumber = Utility.scanString();
		addPerson.setMobileNumber(mobileNumber);

		System.out.println("Enter Address : ");
		System.out.println("Enter city name  : ");
		String city =  Utility.scanString();
		address.setCity(city);
		
		System.out.println("It is "+newAddressbook+" state address book");
		System.out.println("So Eneter State name : "+newAddressbook);
	//	String state = Utility.scanString();
		address.setState(newAddressbook);

		System.out.println("Enter pin code : ");
		int zip = Utility.scanInt();
		address.setZip(zip);

		addPerson.setAddress(address);

		//Add person here
		person.add(addPerson);

		details.setAdressbook("adressbook1");
		details.setPerson(person);

		JsonUtility.writeMapper(addreeBookPathPath,details);
		
//	//	AddressBookModel tempDetails = new AddressBookModel();
//		Person addPerson = new Person();
//		Address address = new Address();
//		
//		//file is empty
//         
//		 if(file.length()!=0) {
//				
//			 details = (AddressBookModel) JsonUtility.readMapper(personInfo, details);
//			}
//		 
//		 if (!details.getPerson().isEmpty()) {
//				person.addAll(details.getPerson());
//			}
//		
//		System.out.println("Enter person information : ");
//		System.out.println("Enter first Name : ");
//		String firstName = Utility.scanString();
//		addPerson.setFirstName(firstName);
//		
//		System.out.println("Enter last Name : ");
//		String lastName = Utility.scanString();
//		addPerson.setLastName(lastName);
//		
//		System.out.println("Enter Address : ");
//		System.out.println("Enter city name  : ");
//		String city = Utility.scanString();
//		address.setCity(city);
//		
//		System.out.println("Enter state name : ");
//		String state = Utility.scanString();
//		address.setState(state);
//		
//		System.out.println("Enter pin code : ");
//		int zip = Utility.scanInt();
//		address.setZip(zip);
//		
//		addPerson.setAddress(address);
//		
//		//Add person here
//		person.add(addPerson);
//		
//		details.setAdressbook("adressbook1");
//		details.setPerson(person);
//		
//		JsonUtility.writeMapper(personInfo,details);
	}
	  public void addState(String addreeBookPath,String newAddressbook) throws JsonParseException, JsonMappingException, IOException {
		    person.clear();  
		    System.out.println("Your Address book created successfully....");
           
             
			
			System.out.println("\nEnter person information in address book : ");
			System.out.println("Enter first Name : ");
			String firstName = Utility.scanString();
			addPerson.setFirstName(firstName);

			System.out.println("Enter last Name : ");
			String lastName = Utility.scanString();
			addPerson.setLastName(lastName);
			
			System.out.println("Enter Mobile number : ");
			String mobileNumber = Utility.scanString();
			addPerson.setMobileNumber(mobileNumber);

			System.out.println("Enter Address : ");
			System.out.println("Enter city name  : ");
			String city =  Utility.scanString();
			address.setCity(city);
			
			//System.out.println("It is "+newAddressbook+" state address book");
			System.out.println("So Eneter State name : ");
			String state = Utility.scanString();
			address.setState(state);

			System.out.println("Enter pin code : ");
			int zip = Utility.scanInt();
			address.setZip(zip);

			addPerson.setAddress(address);

			//Add person here
			person.add(addPerson);

			
			details.setPerson(person);
			details.setAdressbook(newAddressbook);
			JsonUtility.writeMapper(addreeBookPath,details);
	  }
	public  void addAddressBook() throws JsonParseException, JsonMappingException, IOException {
	//	AddressBookModel tempDetails = new AddressBookModel();
		Person addPerson = new Person();
		Address address = new Address();
		
		//file is empty
		 File file = new File(addreeBookPathPath);  
		 if(file.length()!=0) {
				
			 details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
			 person.clear();
			}
		 
		 if (!details.getPerson().isEmpty()) {
				person.addAll(details.getPerson());
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
		
		JsonUtility.writeMapper(addreeBookPathPath,details);
	}
	
	public void printData() throws JsonParseException, JsonMappingException, IOException {
	    //detele information
		details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
		
		ArrayList<Person> printInfo = new ArrayList<Person>();
		
		File file = new File(addreeBookPathPath);
		if (file.length() != 0) {
			details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
			person.clear();
		}

		if (!details.getPerson().isEmpty()) {
			printInfo.addAll(details.getPerson());
		}
		System.out.println("list size is : "+details.getPerson().size());
		for(int i=0;i<details.getPerson().size();i++) {
			System.out.println("Information of "+(i+1)+" person ");
			System.out.println("First name is : "+details.getPerson().get(i).getFirstName());
			System.out.println("Last name is : "+details.getPerson().get(i).getLastName());
			System.out.println("Mobile number is : "+details.getPerson().get(i).getMobileNumber());
			System.out.println("city name is : "+details.getPerson().get(i).getAddress().getCity());
			System.out.println("state name is : "+details.getPerson().get(i).getAddress().getState());
			System.out.println("pin code is : "+details.getPerson().get(i).getAddress().getZip());
			System.out.println();
		}		
	}
	
	public void searchPerson(String addreeBookPathPath,String newAddressbook) throws JsonParseException, JsonMappingException, IOException {
              details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
		
		      ArrayList<Person> printInfo = new ArrayList<Person>();
		
		      File file = new File(addreeBookPathPath);
		      if (file.length() != 0) {
			  details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
			  person.clear();
		      }

		       if (!details.getPerson().isEmpty()) {
			        printInfo.addAll(details.getPerson());
		     }
		       int count = 0;
		       boolean flag = true;
		      while(count<2) {
		    	     System.out.println("Enter Mobile Number : ");
				     String mobNumber =  Utility.scanString();
	
				    //search person information in file
				     String mobileNumbner;
				    
				    for(int i=0;i<details.getPerson().size();i++) {
				    	mobileNumbner = details.getPerson().get(i).getMobileNumber();
				    	
				    	//System.out.println(mobileNumbner);
				    	//System.out.println(mobNumber+ " "+mobileNumbner);
				    	if(mobNumber.equals(mobileNumbner)){
				    		flag = false;
				    		System.out.println("person id is "+(i+1));
							System.out.println("First name is : "+details.getPerson().get(i).getFirstName());
							System.out.println("Last name is : "+details.getPerson().get(i).getLastName());
							System.out.println("Mobile number is : "+details.getPerson().get(i).getMobileNumber());
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
		    	System.out.println();
		    	System.out.println("no person search in list : ");
		    	System.out.println("If you add person in list : \n");
		
		    	System.out.println("Enter your choice : ");
		    	System.out.println("1. add person : ");
		    	System.out.println("2. exit");
		    	
		    	int choice = Utility.scanInt();
		    	switch (choice) {
				case 1:
					    addPerson(addreeBookPathPath,newAddressbook);
					break;
				case 2:
					   System.out.println("Exit");
					   break;
				default:
					break;
				}
		    	
		    }
	}
	public void sortAddressbook(String addreeBookPathPath ,String newAddressbook ) throws JsonParseException, JsonMappingException, IOException {
		 //details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
			File file = new File(addreeBookPathPath);
		 if (file.length() != 0) {
			  details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
			 // person.clear();
		      }

		      
	      ArrayList<Person> printInfo = new ArrayList<Person>();
	
	     // File file = new File(addreeBookPathPath);
	      if (file.length() != 0) {
		  details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
	      }

	       if (!details.getPerson().isEmpty()) {
		        printInfo.addAll(details.getPerson());
	     }
	    //   String name ="";
	      
	}
	public void deletefile(int position,String addreeBookPathPath,String newAddressbook) throws JsonParseException, JsonMappingException, IOException {
		 details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);

		     ArrayList<Person> printInfo = new ArrayList<Person>();

		     File file = new File(addreeBookPathPath);
		     //String filename=Utility.scanString();
		     //file.createNewFile("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/"+".json");
		     if (file.length() != 0) {
		              details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
		              person.clear();
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
		      JsonUtility.writeMapper(addreeBookPathPath,details);
		}
	public void openState(String addreeBookPathPath,String newAddressbook) throws JsonParseException, JsonMappingException, IOException {
	
	    File file = new File(addreeBookPathPath);
		
		 if (file.length() != 0) {
			
			  details = (AddressBookModel) JsonUtility.readMapper(addreeBookPathPath, details);
		      }
//
//		System.out.println("State : ");
//		String[] string = new String[details.getPerson().size()];
//		for(int i=0;i<string.length;i++) {
//			string [i] = details.getPerson().get(i).getAddress().getState(); 
//		}
//		List<String> arrList = new ArrayList<String>();
//	     int cnt= 0;
//	       //List<String> arrList = Arrays.asList(arr);
//	       List<String> lenList = new ArrayList<String>();
//	          for(int i=0;i<string.length;i++){
//	        for(int j=i+1;j<string.length;j++){
//	           if(string[i].equals(string[j])){
//	             cnt+=1;
//	           }                
//	        }
//	        if(cnt<1){
//	          arrList.add(string[i]);
//	        }
//	          cnt=0;
//	        }
//
//	for(int k=0;k<arrList.size();k++){
//	            System.out.println(k+" "+arrList.get(k)+" State");
//	        }
//	
//	     System.out.println("select state ");
//	     String state = Utility.scanString();
	    
	     
	     boolean flag= true;
	     //int id=0;
         int choice;
         while(flag) {
      	   System.out.println("Enter your choice....");
      	   System.out.println("1. print Address book data. ");
      	   System.out.println("2. Add person information in address book. ");
      	   System.out.println("3. Search person in address book. ");
      	   System.out.println("4. Delete person information in address book.");
      	   System.out.println("5. Close Address book.");
      	   choice = Utility.scanInt();
      	   switch (choice) {
			case 1:
				 System.out.println(newAddressbook+" information : ");
			     for(int k=0;k<details.getPerson().size();k++) {
			    	    if(newAddressbook.equals(details.getPerson().get(k).getAddress().getState())) {
			    	    	System.out.println("id is : "+(k+1));
			    	    	System.out.println("First name is : "+details.getPerson().get(k).getFirstName());
			    			System.out.println("Last name is : "+details.getPerson().get(k).getLastName());
			    			System.out.println("mobile number is : "+details.getPerson().get(k).getMobileNumber());
			    			System.out.println("city name is : "+details.getPerson().get(k).getAddress().getCity());
			    			System.out.println("state name is : "+details.getPerson().get(k).getAddress().getState());
			    			System.out.println("pin code is : "+details.getPerson().get(k).getAddress().getZip());
			    			System.out.println();
			    	    }
			     }
				  
				 break;
			case 2:
				    addPerson(addreeBookPathPath,newAddressbook);
				   break;
			case 3:
				    searchPerson(addreeBookPathPath,newAddressbook);
				   break;
			case 4:
				   //printData();
				   System.out.println("enter Id number which one you deleted : ");
		           int position = Utility.scanInt();
				   deletefile(position,addreeBookPathPath,newAddressbook);
			       break;
			case 5:
				  flag=false;
				  System.out.println("close address book...");
                break;
			default:
				System.out.println("wrong choice ...");
				break;
			}
         }
//
//	    Set<String> myset  = new HashSet<String>();
//	    Collections.addAll(myset,string);
//
//	       System.out.println(myset);
	       
	}

}
