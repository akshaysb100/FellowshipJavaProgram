/******************************************************************************
 *  Purpose : database connectivity and some operations of database
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   1-10-2019
 *
 *******************************************************************************/
package com.bridgelabz.jdbc.crudoperations.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Services {
   
	String url = "jdbc:mysql://localhost:3306/Demo"; 
    String user = "root"; 
    String password = "password"; 
 
    Connection connection = null;
    Statement statement = null;
    
    
   
    /**
     * purpose : this function used for create table in database
     * 
     * @param sql : create sql query
     */
    public void craeteTable(String sql) {
    	 try
         { 
         	Class.forName("com.mysql.jdbc.Driver");  
           
             connection = DriverManager.getConnection(url,user,password); 
             
             statement = connection.createStatement();
// 	        String sql = "CREATE TABLE REGISTRATION " +
// 	                   "(id INTEGER not NULL, " +
// 	                   " first VARCHAR(25), " + 
// 	                   " last VARCHAR(25), " + 
// 	                   " age INTEGER, " + 
// 	                   " PRIMARY KEY ( id ))"; 
              
 	        statement.execute(sql);
 	        System.out.println("table created");
            
             connection.close(); 
         } 
         catch(Exception ex) 
         { 
             System.err.println(ex); 
         } 

    }
    /**
     * purpose : this function used Insert data into database
     * 
     * @param sql : sql query for insert data into table
     */
    public void insertDataIntoTable(String sql) {
    	 try
    	    { 
    	    	Class.forName("com.mysql.jdbc.Driver");  
    	       
    	        connection = DriverManager.getConnection(url,user,password); 

    	        statement = connection.createStatement(); 
    	      //  String sql = "insert into REGISTRATION values("+id+",'"+firstName+"','"+lastName+"',"+age+")";
    	        int m = statement.executeUpdate(sql); 
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
    /**
     * purpose : This function used delete table information in database
     * @param sql : delete query
     */
    public void deleteTable(String sql) {
    	try
        { 
        	
  		    Class.forName("com.mysql.jdbc.Driver");  
         
            connection = DriverManager.getConnection(url,user,password); 
  
            statement = connection.createStatement(); 
       
            statement.executeUpdate(sql); 
            System.out.println("delete row...");
            connection.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        }
    }
    /**
     * purpose : this function used for the update the database table
     * @param sql  : updated query
     */
    public void updateTable(String sql) {
    	  try
          { 
          	
    		 Class.forName("com.mysql.jdbc.Driver");  
             // DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
    
              //Reference to connection interface 
              connection = DriverManager.getConnection(url,user,password); 
    
              statement = connection.createStatement(); 
         //     String sql = "update REGISTRATION set age = 21 WHERE id = 3";
              statement.executeUpdate(sql); 
              System.out.println("update value in table...");
              connection.close(); 
          } 
          catch(Exception ex) 
          { 
              System.err.println(ex); 
          
    }
   
  }
    
    /**
     * purpose : this function uesd for the show database table information
     * 
     * @param sql : this query show database table infomation
     */
    public void showTable(String sql) {
    	try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(url,user,password);  
		
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery(sql);  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+"  "+rs.getInt(4));  
			con.close();  
			}catch(Exception e){
			  System.out.println(e);
			  
		}
    }
    
}
