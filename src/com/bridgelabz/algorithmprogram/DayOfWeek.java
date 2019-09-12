/******************************************************************************
 *  Purpose : Day of week 
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
public class DayOfWeek {

	public static void main(String[] args) {
		
		       //System.out.println("Enter day");
				int day=Integer.parseInt(args[0]);
				//System.out.println("Enter Month");
		        int month=Integer.parseInt(args[1]);
		       // System.out.println("Enter year");
		        int year=Integer.parseInt(args[2]);
		        System.out.println("Day Of Week : "+AlgorithmUtility.dayOfWeek(day,month,year));

	}

}
