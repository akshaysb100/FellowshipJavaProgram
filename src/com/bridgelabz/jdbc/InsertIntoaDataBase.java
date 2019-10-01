/******************************************************************************
 *  Purpose : Insert into database
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.bridgelabz.util.Utility;

public class InsertIntoaDataBase {

	public static void main(String[] args) {
		    String url = "jdbc:mysql://localhost:3306/Demo"; 
	        String user = "root"; 
	        String pass = "password"; 
	  
	        System.out.println("Enter student id : ");
	        int id = Utility.scanInt();
 
	        System.out.println("Enter name : ");
	        String name = Utility.scanString();
	        
	        System.out.println("Enter percentage ");
            int per = Utility.scanInt();
            
            String sql = "insert into student values("+id+",'"+name+"',"+per+")";
            Connection connection = null;
            
            try
            { 
            	Class.forName("com.mysql.jdbc.Driver");  
               // DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
      
                //Reference to connection interface 
                connection = DriverManager.getConnection(url,user,pass); 
      
                Statement st = connection.createStatement(); 
                int m = st.executeUpdate(sql); 
                if (m == 1) 
                    System.out.println("inserted successfully : "+sql); 
                else
                    System.out.println("insertion failed"); 
                connection.close(); 
            } 
            catch(Exception ex) 
            { 
                System.err.println(ex); 
            } 

	}

}
