package com.bridgelabz.jsonfile;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;


public class SamleJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = new Employee(1, "Akshay", 400000);
		Person person = new Person(73500, 21, "pune", employee);
       
		
		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		writer.writeValue(new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfile/simpleJesonfile.json"), person);
		
		
		System.out.println("---Done---");
	}

}
