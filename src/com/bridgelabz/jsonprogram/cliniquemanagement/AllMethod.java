package com.bridgelabz.jsonprogram.cliniquemanagement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class AllMethod {
String personInfo = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/doctorlist.json";
	
	File file = new File(personInfo);
	
	int doctorlsit=0;
	int patientList=0;
	
	Model details = new Model();
	
	ArrayList<Doctor> doctor = new ArrayList<Doctor>();
	ArrayList<Patients> patients = new ArrayList<Patients>();
	
	Doctor addDoctor = new Doctor();
	Patients addPatient = new Patients();
		
	/**
	 * purpose : this function is used for add doctor in list
	 * 
	 * @throws JsonParseException : 
	 * @throws JsonMappingException : 
	 * @throws IOException :
	 */
	public void addDoctor() throws JsonParseException, JsonMappingException, IOException {
	//System.out.println("hello");
	//	printDoctorList();
		Model temp = new Model();
		if(file.length()!=0) {
			
			 details = (Model) JsonUtility.readMapper(personInfo, details);
			 doctor.clear();	
		}
		  
		 if (!details.getDoctorList().isEmpty()) {
				doctor.addAll(details.getDoctorList());
			}
		// System.out.println("list new");
		// printDoctorList();
	      
		System.out.println("Add new doctor : ");
		
		System.out.println("Enter Doctor name :");
		String doctorName  = Utility.scanString();
		addDoctor.setDoctorName(doctorName);
		
		System.out.println("Enter specialization of doctor : ");
		String specialization = Utility.scanString();
		addDoctor.setSpecialization(specialization);
		
		System.out.println("Enter shift am or pm ");
		String timing = Utility.scanString();
		addDoctor.setAmPM(timing);
		
		System.out.println("Enter Doctor Id : ");
		int id = Utility.scanInt();
		addDoctor.setId(id);
		addDoctor.setNewNumber(id);
		addDoctor.setOdlNumber((id+5));
		doctor.add(addDoctor);
		details.setDoctorList(doctor);
		JsonUtility.writeMapper(personInfo,details);
		
		
	}
  
	public void save() throws JsonParseException, JsonMappingException, IOException {
		doctor.add(addDoctor);
		details.setDoctorList(doctor);
		JsonUtility.writeMapper(personInfo,details);
	}
	
	/**
	 * purpose : this function is used to delete doctor in list
	 * 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public void deleteDoctor() throws JsonParseException, JsonMappingException, IOException {
		
		if(file.length()!=0) {
			
			 details = (Model) JsonUtility.readMapper(personInfo, details);
				
		}
		  
		 if (!details.getDoctorList().isEmpty()) {
				doctor.addAll(details.getDoctorList());
			}
		 System.out.println("Enter Docotr id : ");
		 int id = Utility.scanInt() ;
		 int position =0;
		 for(int i=0;i<details.getDoctorList().size();i++) {
			 
			 if((id == details.getDoctorList().get(i).getId())) {
				 System.out.println("id deleted"+id);
				  //details.getDoctorList().remove(details.getDoctorList().get(i));
			//	  details.getDoctorList().remove(i);
				  position = i+1;
				 //details.getDoctorList().remove(i).getDoctorName();
			 }
//			 if(id != details.getDoctorList().get(i).getId()){
//				 if()
//			 }
		 }
            for(int i=0;i<details.getDoctorList().size();i++) {
			    
            	if((i+1)==position) {
            		details.getDoctorList().remove(i);
            	}
            	if((i+1)!=position) {
            		if(!details.getDoctorList().isEmpty()) {
            			doctor.addAll(details.getDoctorList());
            		}
            	}
			   
		 }
            JsonUtility.writeMapper(personInfo,details);
	}
	
	public void deletePatient() throws JsonParseException, JsonMappingException, IOException {
		if(file.length()!=0) {
			
			 details = (Model) JsonUtility.readMapper(personInfo, details);
		
				
		}
		 
		 if (!details.getDoctorList().isEmpty()) {
				doctor.addAll(details.getDoctorList());
			}
		 
		 if (!details.getPatients().isEmpty()) {
				patients.addAll(details.getPatients());
			}
		 System.out.println("Enter mobile number : ");
		 String mobile = Utility.scanString();
		 int position=0;
        for(int i=0;i<details.getPatients().size();i++) {
			 
			 if((mobile.equals(details.getPatients().get(i).getMobileNumber()))) {
				 
				 System.out.println("delete patient");
				  //details.getDoctorList().remove(details.getDoctorList().get(i));
			//	  details.getDoctorList().remove(i);
				  position = i+1;
				 //details.getDoctorList().remove(i).getDoctorName();
			 }
//			 if(id != details.getDoctorList().get(i).getId()){
//				 if()
//			 }
		 }
             
            int id=0;
            for(int i=0;i<details.getPatients().size();i++) {
            	
            	if((i+1)==position) {
            		id = details.getPatients().get(i).getId();
            		System.out.println("id "+id);
            		details.getPatients().remove(i);
            		
            		//newNumber = newNumber-1;
            	    //doctor.get(i).setNewNumber(newNumber);
            	}
            	if((i+1)!=position) {
            		if(!details.getPatients().isEmpty()) {
            			patients.addAll(details.getPatients());
            		}
            	}
			   
		 }
            
            int newNumber;
            for(int i=0;i<details.getDoctorList().size();i++) {
            	newNumber = details.getDoctorList().get(i).getNewNumber();
            	System.out.println("new numbers is "+newNumber);
            	if(id == details.getDoctorList().get(i).getId()) {
            		newNumber = newNumber-1;
       		        doctor.get(i).setNewNumber(newNumber);
            		
            		//System.out.println("new number is"+details.getDoctorList().get(i).getNewNumber());
            	}
            }
            
            JsonUtility.writeMapper(personInfo,details);
		 
		 
	}
	
	/**
	 * purpose : this function used to add patient in doctor list
	 * 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
//	public void addPatient() throws JsonParseException, JsonMappingException, IOException {
//		
//		if(file.length()!=0) {
//			
//			 details = (Model) JsonUtility.readMapper(personInfo, details);
//			}
//		 
//		 if (!details.getPatients().isEmpty()) {
//				patients.addAll(details.getPatients());
//			}
//		
//		 
//		    System.out.println("Add new patients : ");
//		    
//		    System.out.println("Enter patients Id : ");
//		    int id = Utility.scanInt();
//		    addPatient.setId(id);
//		    
//			System.out.println("Enter patients name :");
//			String patientsName  = Utility.scanString();
//		    addPatient.setName(patientsName);
//		    
//		    System.out.println("Enter patients age : ");
//		    int age = Utility.scanInt();
//		    addPatient.setAge(age);
//		    
//		    System.out.println("Enter patients mobile number ");
//		    String mobileNumber = Utility.scanString();
//		    addPatient.setMobileNumber(mobileNumber);
//		    
//		    patients.add(addPatient);
//		    details.setPatients(patients);
//		    JsonUtility.writeMapper(personInfo,details);
//		    
//	}
	
	
	/**
	 * purpose : this fuction used to print the doctor data list
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public void printDoctorList() throws JsonParseException, JsonMappingException, IOException {
		details = (Model) JsonUtility.readMapper(personInfo, details);
		
		// System.out.println("list size is : "+details.getDoctorList().size());
		 
		 for(int i=0;i<details.getDoctorList().size();i++) {
			 System.out.println("doctor id : "+details.getDoctorList().get(i).getId());
			 System.out.println("docator name is : "+details.getDoctorList().get(i).getDoctorName());
			 System.out.println("doctor specialization is : "+details.getDoctorList().get(i).getSpecialization());
			 System.out.println("doctor shift is : "+details.getDoctorList().get(i).getAmPM());
			 System.out.println("Number of patients : "+details.getDoctorList().get(i).getNewNumber()%10);
			// System.out.println("doctor newNumber : "+details.getDoctorList().get(i).getNewNumber());
			// System.out.println("doctor oldNumber : "+details.getDoctorList().get(i).getOdlNumber());
			 
			System.out.println();
		 } 
	}	
	
	/**
	 * purpose : this function used to add patient in doctor list
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	public void addPatientAppointment() throws JsonParseException, JsonMappingException, IOException {

		if(file.length()!=0) {
			 details = (Model) JsonUtility.readMapper(personInfo, details);
			 patients.clear();
			 doctor.clear();
			}
		 
		 if (!details.getDoctorList().isEmpty()) {
				doctor.addAll(details.getDoctorList());
			}
		 
		 if (!details.getPatients().isEmpty()) {
				patients.addAll(details.getPatients());
			}
		 
		 System.out.println("Take appoinment form doctor ");
		 System.out.println("Check doctor available or not : ");
		 
		 System.out.println("Enter doctor name first");
		 String doctorName = Utility.scanString();
		 
		 System.err.println("Enter doctor id : ");
		 int doctorid = Utility.scanInt();
		 
		 System.out.println("Enter your appoinment am or pm");
		 String timing = Utility.scanString(); 
		 
		 boolean flag= false;
		int i=0;
		 for(i=0;i<details.getDoctorList().size();i++) {
			 if( doctorid == details.getDoctorList().get(i).getId() && timing.equals(details.getDoctorList().get(i).getAmPM())) {
				 flag = true;
				 break;
			 }
		 }
		 
		 
		 int newNumber;
		 int oldNumber;
		 if(flag==true ) {
			  newNumber = details.getDoctorList().get(i).getNewNumber();
			  oldNumber = details.getDoctorList().get(i).getOdlNumber();
			  System.out.println(newNumber + " "+ oldNumber);
			 if(newNumber<=oldNumber) {
			 newNumber = newNumber+1;
		     doctor.get(i).setNewNumber(newNumber);
		   
		     //System.out.println(details.getDoctorList().get(i).getNewNumber());
			 
// take doctor id to the patient id
	
			 addPatient.setId(doctorid);
			// System.out.println();
			 
			 System.out.println("Doctor is available ");
			 System.out.println("Enter patient name : ");
			 String patientName = Utility.scanString();
			 addPatient.setName(patientName);
			 
			 System.out.println("Enter patient age : ");
			 int age = Utility.scanInt();
			 addPatient.setAge(age);
			 
			 System.out.println("Enter patient mobile number");
			 String mobileNumber = Utility.scanString();
			 addPatient.setMobileNumber(mobileNumber);
			 patients.add(addPatient);
			 details.setPatients(patients);
			 JsonUtility.writeMapper(personInfo,details);
			 }else {
				 System.out.println("Doctor list is full....");
				 
			 }
			 
		 }else {
			 System.out.println("doctor is not available....");
//			 System.out.println("doctor id : "+details.getDoctorList().get(i).getId());
//			 System.out.println("docator name is : "+details.getDoctorList().get(i).getDoctorName());
//			 System.out.println("doctor specialization is : "+details.getDoctorList().get(i).getSpecialization());
//			 System.out.println("doctor shift is : "+details.getDoctorList().get(i).getAmPM());
		 }
		 
	}
	public void printDoctorPatients() throws JsonParseException, JsonMappingException, IOException {
		

		if(file.length()!=0) {
			
			 details = (Model) JsonUtility.readMapper(personInfo, details);
			}
		 
		 if (!details.getDoctorList().isEmpty()) {
				doctor.addAll(details.getDoctorList());
			}
		 
		 if (!details.getPatients().isEmpty()) {
				patients.addAll(details.getPatients());
			}
		
		System.out.println("Enter Doctor name  ");
		String doctorName = Utility.scanString();
		System.out.println("Enter Doctor Id  ");
		int id = Utility.scanInt();
		int i;
		int j;
		for(i=0;i<details.getDoctorList().size();i++){
			
			if(id == details.getDoctorList().get(i).getId()) {
				System.out.println("Doctor name is : "+details.getDoctorList().get(i).getDoctorName());
				System.out.println("doctor specialization is : "+details.getDoctorList().get(i).getSpecialization());
				System.out.println("Number of patients : "+details.getDoctorList().get(i).getNewNumber()%10);
				System.out.println("Doctor list : "); 
				System.out.println();
				for(j=0;j<details.getPatients().size();j++ ) {
					
					if(id == details.getPatients().get(j).getId()) {
						System.out.println("Patient name is: "+details.getPatients().get(j).getName());
						System.out.println("Patient age is : "+details.getPatients().get(j).getAge());
						System.out.println("Patient moblie number is : "+(details.getPatients().get(j).getMobileNumber()));
				//		System.out.println("Patient id is : "+details.getPatients().get(j).getId());
						System.out.println();
					}
				}
				break;
			}
		}
	}
}
