/******************************************************************************
 *  Purpose : calculate Harmonic Number
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class HarmonicNumber {
	
	public static void main(String[] args) {
		//System.out.println("");
			double number = Integer.parseInt(args[0]);
            double value; 			
	        value = Utility.harmonicNumber(number);
	        System.out.println("Harmonic number is : "+value);
		
          }

}
