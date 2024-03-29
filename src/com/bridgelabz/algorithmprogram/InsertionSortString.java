/******************************************************************************
 *  Purpose: insertion sort progarm for String values
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
public class InsertionSortString {

	public static void main(String[] args) {
		
	 //    String[] insertionSortArray = {"sk","ak","za","aa","dk"};
		
		   System.out.println("How much element you enter : ");
		   int numberOfCount=AlgorithmUtility.scanInt();
		
		   String[] insertionSortArray = new String[numberOfCount];
		   System.out.println("Enter String elements : ");
	       for(int index=0;index<insertionSortArray.length;index++) {
	    	   insertionSortArray[index]=AlgorithmUtility.scanString();
	       }
	       
	       System.out.println("Insertion sort program String : ");
	       AlgorithmUtility.insertionSortString(insertionSortArray, insertionSortArray.length);
	       for(int index=0;index<insertionSortArray.length;index++) {
	    	   System.out.print(insertionSortArray[index]+" ");
	       }

	}

}
