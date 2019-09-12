/******************************************************************************
 *  Purpose:  check string is Anagram or not
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.Utility;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter first string");
		String string1=Utility.scanString();
		System.out.println("Enter second string");
		String string2=Utility.scanString();
	    string1=string1.toLowerCase();
		string2=string2.toLowerCase();
		boolean value =AlgorithmUtility.Anagram(string1,string2);
		
		if(value==true)
			System.out.println("String "+string1+" and "+string2+" are anagram String");
		else {
			System.out.println("String "+string1+" and "+string2+" not anagram String");
		}

	}

}
