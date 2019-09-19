package com.bridgelabz.jsonfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;



public class ReadJsonFile {

	public static void main(String[] args) throws IOException {
		 ObjectMapper mapper;
	     
	    	 mapper = new ObjectMapper();
	    
	    
		List<Person> listOfPersons1 = mapper.readValue(new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfile/simple.json"), new TypeReference<List<Person>>(){});
		
		
		System.out.println(listOfPersons1.get(0).getEmployee().getName());
		
		System.out.println(listOfPersons1.get(1).getMobileNumber());
		
      
	}

}
