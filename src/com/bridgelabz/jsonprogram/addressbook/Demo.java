package com.bridgelabz.jsonprogram.addressbook;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class Demo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		AdressBooktemp temp = new AdressBooktemp();
 
		temp.addState();
       
	}

}
