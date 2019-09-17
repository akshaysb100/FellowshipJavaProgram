/******************************************************************************
 *  Purpose: Bubbule Sort program
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;

public class BubbleSortInteger {

	public static void main(String[] args) {
		
	       System.out.println("bubble sort program : ");
	       
	       System.out.println("Enter length of array : ");
	       int length = AlgorithmUtility.scanInt();
	       int[] bubbleSortArray = new int[length];
	       System.out.println("Enter Elements in array : ");
	       for(int index=0;index<length;index++) {
	    	   bubbleSortArray[index] = AlgorithmUtility.scanInt();
	       }
	       AlgorithmUtility.bubbleSortIntegerValue(bubbleSortArray);
	       for(int index=0;index<bubbleSortArray.length;index++) {
	    	   System.out.print(bubbleSortArray[index]+" ");
	       }

	}

}
