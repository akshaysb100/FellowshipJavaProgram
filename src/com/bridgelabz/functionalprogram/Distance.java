/******************************************************************************
 *  Purpose : Euclidean Distance program
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class Distance {

	public static void main(String[] args) {
		int firstValue=Integer.parseInt(args[0]);
		int secondValue=Integer.parseInt(args[1]);

		System.out.println("Euclidean Distance form (x,y) to (0,0) is : "+Utility.EuclideanDistance(firstValue,secondValue));

	}

}
