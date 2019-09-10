/******************************************************************************
 *  Purpose: calculate quadratic equation
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class Quadratic {

	public static void main(String[] args) {
		double fistQuadraticValue=Double.parseDouble(args[0]);
		double secondQuadraticValue=Double.parseDouble(args[1]);
		double thirdQuadraticValue=Double.parseDouble(args[2]);
        Utility.quadratic(fistQuadraticValue,secondQuadraticValue,thirdQuadraticValue);

	}

}
