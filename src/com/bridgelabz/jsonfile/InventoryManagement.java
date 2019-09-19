package com.bridgelabz.jsonfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.Utility;

public class InventoryManagement {

	public static void main(String[] args) throws IOException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
	    List<Details> listOfDetails = mapper.readValue(new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfile/simple.json"), new TypeReference<List<Details>>(){});
	    List<Rice> listOfDetails1 = mapper.readValue(new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfile/simple.json"), new TypeReference<List<Rice>>(){});
	    
		System.out.println(listOfDetails.get(0).getRice().getPrice());
		System.out.println(listOfDetails.get(0).getRice().getPrice());
		
		
	
	}
}
