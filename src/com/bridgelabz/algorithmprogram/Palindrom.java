/******************************************************************************
 *  Purpose: Check String is palindrom or not
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		String palindromeString = AlgorithmUtility.scanString();
		boolean value;
		value=AlgorithmUtility.palindrom(palindromeString);
        if(value==true) {
        	System.out.println("String is palindrom : ");
        }
        else {
        	System.out.println("String is not palindrom :");
        }

	}

}
