/******************************************************************************
 *  Purpose: Calculate prime factor of number
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");  
		int number=Utility.scanInt();
	    Utility.primeFactor(number);
		

	}

}
