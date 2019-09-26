/******************************************************************************
 *  Purpose : Find SecondLargest Number 
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class SecondLargestNumber {

	public static void main(String[] args) {
		System.out.println("Enter the length of array : ");
		int length=Utility.scanInt();
		int maxArray[]=new int[length];
		
		System.out.println("Enter the "+length+" Element in MaxArray : ");
		
		for(int index=0;index<length;index++) {
			maxArray[index]=Utility.scanInt();
		}
		
		System.out.println("Second largest element is : "+Utility.secondLargestNumber(maxArray,length));
		

	}

}
