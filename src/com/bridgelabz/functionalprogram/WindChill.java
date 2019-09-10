/******************************************************************************
 *  Purpose: check National Weather Service
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class WindChill {

	public static void main(String[] args) {
		double temperature = Double.parseDouble(args[0]);
		double speed = Double.parseDouble(args[1]);
		double result;
		
		result=Utility.windChill(temperature,speed);
		if(result>0) {
			System.out.println(result);
		}else {
			 System.out.println("the formula is not valid if temperatur is larger than 50 and if speed is larger than 120 or less than 3");
		}

	}

}
