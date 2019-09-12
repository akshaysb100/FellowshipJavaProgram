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
	       int[] bubbleSortArray = {10,20,11,15,13,18,16};
	       AlgorithmUtility.bubbleSortIntegerValue(bubbleSortArray);
	       for(int index=0;index<bubbleSortArray.length;index++) {
	    	   System.out.print(bubbleSortArray[index]+" ");
	       }

	}

}
