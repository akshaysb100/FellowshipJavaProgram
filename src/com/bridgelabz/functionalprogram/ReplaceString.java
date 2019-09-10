/******************************************************************************
 *  Purpose : Replace String
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class ReplaceString {

	public static void main(String[] args) {
       
		String userString = "Hello UserName ,How are you ?";
		String[] changeUser = userString.split(" ");
		
		System.out.println("Enter your name ");
	 	String name = Utility.scanString();
	 	String newUserString;
	 	newUserString=Utility.replaceString(changeUser,name);
		System.out.println(newUserString);
		
	}

}
