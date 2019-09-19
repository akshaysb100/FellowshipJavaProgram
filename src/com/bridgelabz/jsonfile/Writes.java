package com.bridgelabz.jsonfile;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class Writes {

	public static void main(String[] args) {
		
		List<Details> list = new ArrayList<Details>();
		List<Rice> list1 = new ArrayList<Rice>();
		System.out.println("how much person enter into list : ");
		int number = Utility.scanInt();
	//	Person person[] = new Person[number];
		Rice rice[] = new Rice[number];
		Details d[] = new Details[4];
		Employee employee[] = new Employee[number];
		for(int index=0;index<number;index++) {
			d[index] = new Details();
			for(int i=0;i<2;i++) {
				rice[i] = new Rice();
				System.out.println("enter name : ");
				String name = Utility.scanString();
				rice[i].setName(name);
			//	list1.add(rice[i]);
				d[index].setRice(rice[i]);
				list.add(d[i]);
			}
			d[index] = new Details();
			
			
			list.add(d[index]);
			System.out.println("Enter next person info : ");
		}

	    String jsonPath = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfile/simple.json";
		JsonUtility.WriteVlueFile(jsonPath,list);
	
		System.out.println("===== Done =====");
	}

}
