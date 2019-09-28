/******************************************************************************
 *  Purpose: Clinique Management 
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.oop.json.cliniquemanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.Utility;

public class CliniqueManagementMain {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException{
		
		//psychiatris pediatricians Cardiologist Dermatologist
		
		Services list = new Services();
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
     	   System.out.println("3. take appoinment form patients : ");
     	   System.out.println("4. print doctor pateint list : ");
     	   System.out.println("5. Delete Doctor form list");
     	   System.out.println("6. exit.");
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
				  flag=false;
				  System.out.println("");
                 break;
			case 7:
				list.deletePatient();
			default:
				System.out.println("wrong choice ...");
				 break;
			}
        }
	}

}
