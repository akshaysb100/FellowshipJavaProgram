package com.bridgelabz.jsonfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.JsonUtility;

public class ReadJsonFile {

	public static void main(String[] args) throws IOException {
  
        File jsonFile = new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfile/simpleJesonfile.json");	    
        BufferedReader buffer = new BufferedReader(new FileReader(jsonFile));
        
   		String bufferReader=buffer.readLine();
   		
   		String tempString="";
   		
   		while(bufferReader!=null) {
   			tempString = tempString+bufferReader;
   			bufferReader = buffer.readLine(); 
   		}
   		
   		Person person = JsonUtility.convertJsonToJava(tempString, Person.class);
   	//  System.out.println(tempString);
   		System.out.println(person.getEmployee().getName());
   	    System.out.println(person.getMobileNumber());
   	    System.out.println(person.getAge());
   	    System.out.println(person.getCity());
   	    System.out.println(person.getEmployee().getSalary());
   	    System.out.println(person.getEmployee().getEmpNo());
	    //System.out.println("Mobile Number is : "+person.getMobileNumber());
	    //System.out.println("Employee Details : "+person.getEmployee());
	    
	    buffer.close();
	}

}
