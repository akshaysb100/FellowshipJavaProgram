/******************************************************************************
 *  Purpose:  check number is prime or not
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
public class RangeOfPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Prime number range : ");
		int range=AlgorithmUtility.scanInt();
		  int array[]=new int[range];
		 
		int primeArray[]= AlgorithmUtility.rangeOfPrimeNumber(array,range);
		
		  for(int i=0;i<primeArray.length;i++) {
			  System.out.println(primeArray[i]);
			  }

	}

}
