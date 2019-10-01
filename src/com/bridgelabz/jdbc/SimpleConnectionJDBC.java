/******************************************************************************
 *  Purpose : Show database
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleConnectionJDBC {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/Demo","root","password");  
			//here sonoo is database name, root is username and password  
		      
			
//			
//			  Statement stmt=con.createStatement();  
//		      String query = "update student set name ='rohit' where idstudent = 1";
//		      PreparedStatement preparedStmt = con.prepareStatement(query);
//		      // execute the java preparedstatement 
//		      preparedStmt.executeUpdate();
//		      con.close();

		      
			Statement stmt=con.createStatement(); 
	//       ResultSet rs1 =stmt.executeQuery("update idstudent=1 where name=rohit");
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

	}

}
