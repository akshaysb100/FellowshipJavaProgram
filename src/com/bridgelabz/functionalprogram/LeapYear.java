/******************************************************************************
 *  Purpose: Check Year is leap year or not
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter year :");
		int year = Utility.scanInt();
	     boolean value;
	     if(year >= 1000 && year < 10000) {
		   value = Utility.leapYear(year);
	         	if(value == true) {
			         System.out.println(year+ " is leap year.");			
		        }else {
			        System.out.println(year+ " is not leap year");
		          }
	       }else {
		       System.out.println("4 digit year only enter : ");
	   }
	}

}
