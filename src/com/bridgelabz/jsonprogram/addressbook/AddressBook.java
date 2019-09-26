/******************************************************************************
 *  Purpose: Address book
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jsonprogram.addressbook;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.jsonprogram.cliniquemanagement.AllMethod;
import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class AddressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		 
		 String addressBook = "";
		 String newAddressbook = "";
		  
		 ObjectMapper mapper = new ObjectMapper();
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
        	   System.out.println("2. Add new address book. ");
        	   System.out.println("3. Close all Address books.");
        	   choice = Utility.scanInt();
        	   switch (choice) {
			case 1:
				
				   //listDetails.printData();
				   System.out.println("Enter address book name");
				   newAddressbook = Utility.scanString();
				   addressBook ="/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/"+newAddressbook+".json";
				   listDetails.openState(addressBook);
				  
				 break;
			case 2:
				   System.out.println("Create new address book.... ");
				   System.out.println("Enter Address book name");
				   newAddressbook = Utility.scanString();
				   addressBook = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/"+newAddressbook+".json"; 
				   mapper.writeValue(new File(addressBook),AddressBookMethod.class);
				   listDetails.addState(addressBook);
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
