package com.bridgelabz.jsonprogram.addressbook;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.Utility;

public class AddressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
           AddressBookMethod listDetails = new AddressBookMethod();
         //  AdressBooktemp temp =new AdressBooktemp();
           //listDetails.printData();
         // listDetails.addPerson();
         // listDetails.printData();
         
        //temp.setPerson();
             //temp.addSate();
             //temp.setPerson();
           String state;
    
           boolean flag= true;
           int choice;
           while(flag) {
        	   System.out.println("Enter your choice....");
        	   System.out.println("1. Open Address books. ");
        	   System.out.println("2. Add new state in address book. ");
        	   System.out.println("3. Close all Address books.");
        	   choice = Utility.scanInt();
        	   switch (choice) {
			case 1:
				   listDetails.printData();
				   listDetails.openState();
				  
				 break;
			case 2:
				   listDetails.addPerson();
				   break;
			case 3:
				  flag=false;
				  System.out.println("close address books...");
                  break;
			default:
				System.out.println("wrong choice ...");
				break;
			}
           }
          
	}

}
