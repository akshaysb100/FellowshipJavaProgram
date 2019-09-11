/******************************************************************************
 *  Purpose: Sample program
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.Utility;

public class SampleProgram {

	public static void main(String[] args) {
		
     int array[] = {10,20,11,15,13,18,16};
     int size=array.length;
     System.out.println("bubble sort program : ");
       int[] bubbleSortArray = {10,20,11,15,13,18,16};
       Utility.bubbleSortIntegerValue(bubbleSortArray);
       for(int index=0;index<bubbleSortArray.length;index++) {
    	   System.out.print(bubbleSortArray[index]+" ");
       }
       System.out.println();
       String[] bubbleSortArray1 = {"sk","ak","za","aa","dk"};
       System.out.println("bubble sort program String : ");
       Utility.bubbleSortStringValue(bubbleSortArray1);
       for(int index=0;index<bubbleSortArray1.length;index++) {
    	   System.out.print(bubbleSortArray1[index]+" ");
       }
       
       System.out.println();
       System.out.println("binary search program for String : ");
       String stringArray[]=bubbleSortArray1;
       String key="aks";
      int value;
      value= Utility.binarySearchStringValue(stringArray, key);
      if(value>=0) {
       for(int index=0;index<stringArray.length;index++) {
    	   if(stringArray[index]==stringArray[value]) {
    		   System.out.println(stringArray[value]+" element is found on "+index+" index");
    	   }
       }
     }else {
    	 System.out.println("Element is not found : "+key);
     }
      
       /*
       System.out.println("insertion sort program : ");
      Utility.insertionSortIntegerValue(array, size);

       for(int index=0;index<array.length;index++) {
    	   System.out.print(array[index]+" ");
       }
       System.out.println();
       
       System.out.println();
       System.out.println("Enter your key :");
       int key=Utility.scanInt();
       
       int value=Utility.binarySearchIntValue(array,0, key, array.length);
       if(value!=0) {
    	   System.out.println("your key is found : "+value);
       }else {
    	   System.out.println("your key is not found : "+key);
       }
       */
	}

}
