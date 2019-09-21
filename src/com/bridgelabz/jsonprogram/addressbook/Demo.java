package com.bridgelabz.jsonprogram.addressbook;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class Demo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
           AddressBookMethod listDetails = new AddressBookMethod();
           System.out.println("Add person :");
          // listDetails.addPerson();
           listDetails.printData();
           System.out.println();
           System.out.println("search person in list ");
           listDetails.searchPerson();
	}

}
