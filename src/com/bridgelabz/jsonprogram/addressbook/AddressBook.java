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
import java.io.FileReader;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.util.DataStructurUtility;
import com.bridgelabz.util.Utility;

public class AddressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		 

        DataStructurUtility<String> util=new DataStructurUtility<String>();
		FileReader reader=new FileReader("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/states.txt");
		    int character;
            String s="";
		
            for(character=0;(character=reader.read())!=-1;character++) {
            	
            	s=s+(char) character;
            }
            
            String[] searchString = s.split(" ");
           
            for(int index=0;index<searchString.length;index++) {
         	   util.addList(searchString[index]);
         }
            
		 String addressBook = "";
		 String newAddressbook = "";
		  
		 ObjectMapper mapper = new ObjectMapper();
		 AddressBookServices listDetails = new AddressBookServices();
         //  AdressBooktemp temp =new AdressBooktemp();
           //listDetails.printData();
         // listDetails.addPerson();
         // listDetails.printData();
         
        //temp.setPerson();
             //temp.addSate();
             //temp.setPerson();
         //  String state;
    
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
				    System.out.println("Address books ");
				    util.viewSate();
				   //listDetails.printData();
				   System.out.println("\nwhich one address book you open");
				   System.out.println("Enter adress book name : ");
				   newAddressbook = Utility.scanString();
				   addressBook ="/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/"+newAddressbook+".json";
				   listDetails.openState(addressBook,newAddressbook);
				    
				 break;
			case 2:
				   
				   System.out.println("Create new address book.... ");
				   System.out.println("Enter Address book name");
				   newAddressbook = Utility.scanString();
				   addressBook = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/"+newAddressbook+".json"; 
				   mapper.writeValue(new File(addressBook),AddressBookServices.class);
				   listDetails.addState(addressBook,newAddressbook);
                   util.addList(newAddressbook);
                   util.addState();
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
