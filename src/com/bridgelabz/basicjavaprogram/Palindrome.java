/******************************************************************************
 *  Purpose: Check String is palindrome or not
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.Utility;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		String palindromeString = Utility.scanString();
		boolean value;
		value=Utility.palindrom(palindromeString);
        if(value==true) {
        	System.out.println("String is palindrom : ");
        }
        else {
        	System.out.println("String is not palindrom :");
        }
	}

}
