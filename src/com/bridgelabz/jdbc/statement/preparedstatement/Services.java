
package com.bridgelabz.jdbc.statement.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bridgelabz.util.Utility;

public class Services {
	String url = "jdbc:mysql://localhost:3306/Demo"; 
    String user = "root"; 
    String password = "password"; 
 
    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    
   
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
    	        preparedStatement = connection.prepareStatement(sql);  
                System.out.println("how much row you inserted.");
                int row = Utility.scanInt();
                for(int i=0;i<row;i++) {
                	System.out.println("Enter id : ");
                	int id = Utility.scanInt();
                	System.out.println("Enter name of student : ");
                	String name = Utility.scanString();
                	System.out.println("Enter percentage of student");
                	int per = Utility.scanInt();
                	preparedStatement.setInt(1,id);
          	        preparedStatement.setString(2, name);
          	        preparedStatement.setInt(3, per);
          	      int j=preparedStatement.executeUpdate();  
          	    
      	        if (j == 1) 
      	            System.out.println("inserted successfully : "+sql); 
      	        else
      	            System.out.println("insertion failed"); 
                }
    	      
    	      
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
            
            preparedStatement = connection.prepareStatement(sql);
            
            System.out.println("how much row you deleted");
            int row = Utility.scanInt();
            for(int index=0;index<row;index++) {
            	 System.out.println("Enter id : ");
                 int id = Utility.scanInt();
                 preparedStatement.setInt(1, id);
                 
               int i =  preparedStatement.executeUpdate(); 
               if(i == 1) {
             	  System.out.println("row deleted.");
               }else {
             	  System.out.println("row not deleted.");
               }
            }
           
           
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
            
              connection = DriverManager.getConnection(url,user,password); 
    
              preparedStatement = connection.prepareStatement(sql);
            
              preparedStatement.setString(1, "ashok");
            
              preparedStatement.setInt(2,3);
              
           
              
              int i =  preparedStatement.executeUpdate(); 
              if(i == 1) {
            	  System.out.println("update value in table...");
              }else {
            	  System.out.println("not update value in table...");
              }
            
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
			 connection = DriverManager.getConnection(url,user,password);  
		
			preparedStatement =connection.prepareStatement(sql);
			ResultSet result = preparedStatement.executeQuery();
			while(result.next())  
			System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getInt(3));  
			 connection.close(); 
			}catch(Exception e){
			  System.out.println(e);
			  
		}
    }
    
}
