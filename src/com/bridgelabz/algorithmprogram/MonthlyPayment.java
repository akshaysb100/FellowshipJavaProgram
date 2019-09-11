/******************************************************************************
 *  Purpose: calculates the monthly payments
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
//		System.out.println("Enter principal loan Amount");
			double principalAmount=Double.parseDouble(args[0]);
		//	System.out.println("Enter year");
			double year=Double.parseDouble(args[1]);
		//	System.out.println("Enter Amount");
		    double rate=Double.parseDouble(args[2]);
		    
		    Utility.monthlyPayment(principalAmount,year,rate);
		    

	}

}
