package com.bridgelabz.jsonprogram.cliniquemanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.Utility;

public class CliniqueManagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException{
		
		//psychiatris pediatricians Cardiologist Dermatologist
		
		AllMethod list = new AllMethod();
//		list.addDoctor();
//		list.printDoctorList();
//	    list.addDoctor();
//	    list.printDoctorList();
        
        int choice;
        boolean flag = true;
        while(flag) {
     	   System.out.println("Enter your choice....");
     	   System.out.println("1. Add doctor. ");
     	   System.out.println("2. print doctor list. ");
     	   System.out.println("3. take appoinment form doctor : ");
     	   System.out.println("4. print doctor pateint list : ");
     	   System.out.println("5. Delete Doctor form list");
     	   System.out.println("6. Delete patient form list");
     	   System.out.println("7. exit.");
     	   choice = Utility.scanInt();
     	   switch (choice) {
			case 1:  
			     list.addDoctor();
				 break;
			case 2:
				 list.printDoctorList();
				   break;
			case 3:
				 list.addPatientAppointment();
				 break;
			case 4:
				list.printDoctorPatients();
				break;
			case 5:
				System.out.println("Delete Docotr form list");
				list.deleteDoctor();
				break;
			case 6:
				 System.out.println("Delete patient form list");
				 list.deletePatient();
				 break;
			case 7:
				  flag=false;
				  System.out.println("");
                 break;
			default:
				System.out.println("wrong choice ...");
				 break;
			}
        }
	}

}
