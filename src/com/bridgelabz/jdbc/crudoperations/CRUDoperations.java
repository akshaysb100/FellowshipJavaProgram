/******************************************************************************
 *  Purpose : CRUD opration perform on database
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   1-10-2019
 *
 *******************************************************************************/
package com.bridgelabz.jdbc.crudoperations;
import com.bridgelabz.jdbc.crudoperations.services.Services;
import com.bridgelabz.util.Utility;

public class CRUDoperations {

	public static void main(String[] args) {
		
		Services service = new Services();
		boolean flag = true;
		int choice = 0;
		String sqlQuery;
		while(flag) {
			System.out.println("Enter your choice : ");
			System.out.println("1. create table in databse : ");
			System.out.println("2. show table infromation : ");
			System.out.println("3. insert data into table : ");
			System.out.println("4. update data into table : ");
			System.out.println("5. delete row in table : ");
			System.out.println("6. Exit");
			choice = Utility.scanInt();
			
			
			switch (choice) {
			case 1:
				 
				  sqlQuery = "CREATE TABLE REGISTRATION " +
	 	                   "(id INTEGER not NULL, " +
	 	                   " first VARCHAR(25), " + 
	 	                   " last VARCHAR(25), " + 
	 	                   " age INTEGER, " + 
	 	                   " PRIMARY KEY ( id ))"; 

				  service.craeteTable(sqlQuery);
				  break;
			case 2:
				  sqlQuery = "select * from REGISTRATION";
				  service.showTable(sqlQuery);
				  break;
			case 3:
			       System.out.println("Enter student id : ");
		           int id = Utility.scanInt();

		           System.out.println("Enter first name : ");
		           String firstName = Utility.scanString();
		       
		           System.out.println("Enter last name : ");
		           String lastName = Utility.scanString();
		        
		           System.out.println("Enter age : ");
		           int age = Utility.scanInt();
			    
		           sqlQuery = "insert into REGISTRATION values("+id+",'"+firstName+"','"+lastName+"',"+age+")";
			    
		           service.insertDataIntoTable(sqlQuery);
			       break;
			case 4:
				   sqlQuery = "update REGISTRATION set age = 23 WHERE id = 3";
				   service.updateTable(sqlQuery);
				   break;
			case 5:
				   sqlQuery = "DELETE FROM REGISTRATION WHERE id = 4";
				   service.deleteTable(sqlQuery);
				   break;
			case 6:
				   flag = false;
				   System.out.println("Exit");
				   break;
			default:
				   System.out.println("wrong choice....");
			       break;
			}
			
		}

	}

}
