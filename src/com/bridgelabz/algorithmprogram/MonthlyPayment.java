/******************************************************************************
 *  Purpose: calculates the monthly payments
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
public class MonthlyPayment {

	public static void main(String[] args) {
//		System.out.println("Enter principal loan Amount");
			double principalAmount=Double.parseDouble(args[0]);
		//	System.out.println("Enter year");
			double year=Double.parseDouble(args[1]);
		//	System.out.println("Enter Amount");
		    double rate=Double.parseDouble(args[2]);
		    
		    AlgorithmUtility.monthlyPayment(principalAmount,year,rate);
		    

	}

}
