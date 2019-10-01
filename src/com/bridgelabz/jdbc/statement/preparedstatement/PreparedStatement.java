package com.bridgelabz.jdbc.statement.preparedstatement;

import com.bridgelabz.util.Utility;

public class PreparedStatement {

	public static void main(String[] args) {
		
		Services services = new Services();
	    
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
				   services.showTable("select * from student");
				   break;
			case 3:
				   services.insertDataIntoTable("insert into student values(?,?,?)");
			       break;
			case 4:
				   services.updateTable("update student set name=? where idstudent=?");
				   break;
			case 5:
				   services.deleteTable("delete from student where idstudent=?");
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
