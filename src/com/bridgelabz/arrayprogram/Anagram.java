/******************************************************************************
 *  Purpose:  check Anagram or not in 2D array
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.arrayprogram;

import java.util.Arrays;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.Utility;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println("prime number : ");
		
		
		int range=AlgorithmUtility.scanInt();
		  int array[]=new int[range];
		 
		int primeArray[]= AlgorithmUtility.rangeOfPrimeNumber(array,range);
		 
		 int temp=0;
		 int count=0;
		 int m=0;
		 int[] anagramArray = new int [10]; 
		 int p[]=new int[10],q=0;
		 int x[]=new int[10],z=0;
		for(int i=0;i<primeArray.length;i++) {
			 int digit=0;
			   temp=0;
			   q=0;
			  
			   temp=primeArray[i];
			//   System.out.println("temp : "+temp);
			while(temp>0) {
				digit=temp%10;
				p[q]=digit;
			//	System.out.println("sub int "+p[q]);
				q++;
				temp=temp/10;
			}
		//	System.out.println("new element");
			 AlgorithmUtility.bubbleSortIntegerValue(p);
			
			
			for(int index=0;index<primeArray.length;index++) {
				z=0;
				temp=0;
				count=0;
				 temp=primeArray[index];
				 if(i!=index) {
					
					 while(temp>0) {
							digit=temp%10;
							x[z]=digit;
							z++;
							temp=temp/10;
						}
					 AlgorithmUtility.bubbleSortIntegerValue(x);
					 
					 for(int a=0;a<p.length;a++) {
						 for(int j=0;j<x.length;j++) {
							
							 if(p[a]==x[j]) {
								 count++;
								 break;		 
							 }
						 }
					 }
					 
					 if(count==p.length) {
						 anagramArray[m]=primeArray[i];
						 m++;
						 break;
					 }
				 }
				   
			}
		}
		
		for(int i=0;i<anagramArray.length;i++) {
			System.out.println("\nanagram " +anagramArray[i]);
		}
		

		  
	}

}
