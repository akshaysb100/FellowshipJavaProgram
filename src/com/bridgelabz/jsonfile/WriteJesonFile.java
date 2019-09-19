package com.bridgelabz.jsonfile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.JsonMappingException;
import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;


public class WriteJesonFile {

	public static void main(String[] args) throws IOException, JsonMappingException, IOException {
		
		
		List<Person> listOfPersons = new ArrayList<Person>();
		System.out.println("how much person enter into list : ");
		int number = Utility.scanInt();
		Person person[] = new Person[number];
		Employee employee[] = new Employee[number];
		for(int index=0;index<number;index++) {
			person[index] = new Person();
			employee[index] = new Employee();
			System.out.println("Enter Employee id : ");
			int id = Utility.scanInt();
			employee[index].setEmpNo(id);
			
			System.out.println("Enter Employee name : ");
			String name = Utility.scanString();
			employee[index].setName(name);
			
			System.out.println("Enter Employee salary : ");
			double salary = Utility.scanDouble();
			employee[index].setSalary(salary);
			
			System.out.println("enter person age : ");
			int age = Utility.scanInt();
			person[index].setAge(age);
			
			System.out.println("Enter person city : ");
			String city = Utility.scanString();
			person[index].setCity(city);
			
			System.out.println("Enter person moboil number :");
			String mobNumber = Utility.scanString();
			person[index].setMobileNumber(mobNumber);
			
			person[index].setEmployee(employee[index]);
 
			listOfPersons.add(person[index]);
			System.out.println("Enter next person info : ");
		}

	    String jsonPath = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfile/simpleJesonfile.json";
		JsonUtility.WriteVlueFile(jsonPath,listOfPersons);
	
		System.out.println("===== Done =====");

	}

}
