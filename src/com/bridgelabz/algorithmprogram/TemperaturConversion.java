/******************************************************************************
 *  Purpose: Temperature conversion(Celsius to Fahrenheit or Fahrenheit to Celsius)
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.Utility;

public class TemperaturConversion {

	public static void main(String[] args) {
		
		System.out.println("Enter value for Celsius");
		double celsius=Utility.scanDouble();
		System.out.println("Enter value for Fahrenheit");
		double fahrenheit=Utility.scanDouble();
		
		Utility.temperaturConversion(celsius,fahrenheit);


	}

}
