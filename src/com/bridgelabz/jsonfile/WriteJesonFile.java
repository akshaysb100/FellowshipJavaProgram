package com.bridgelabz.jsonfile;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

import com.bridgelabz.util.JsonUtility;

public class WriteJesonFile {

	public static void main(String[] args) throws IOException, JsonMappingException, IOException {
		Employee employee = new Employee();
		ObjectMapper mapper = new ObjectMapper();
		employee.setEmpNo(1);
		employee.setName("Aniket");
		employee.setSalary(500000.0);
		
		Person person = new Person();
		
		person.setAge(21);
		person.setCity("pune");
		person.setMobileNumber("8605555260");
		person.setEmployee(employee);
		
		String jsonPerson = JsonUtility.convertJavaToJson(person);

		ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
		writer.writeValue(new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfile/simpleJesonfile.json"), person);
	
		System.out.println("===== Done =====");

	}

}
