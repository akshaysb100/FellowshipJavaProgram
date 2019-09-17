/******************************************************************************
 *  Purpose:  check Anagram or not in Stack
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.DataStructurUtility;

public class AnagramStack {

	public static void main(String[] args) {
 
        System.out.println("prime number : ");
		
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list1 = new DataStructurUtility<Integer>();
		int range=AlgorithmUtility.scanInt();
		  int array[]=new int[range];
		 
		int primeArray[]= AlgorithmUtility.rangeOfPrimeNumber(array,range);
	
		for(int i=0;i<primeArray.length;i++) {
			System.out.println(primeArray[i]);
		}
		System.out.println("Anagram numbers is : ");
		for(int index1=0;index1<primeArray.length;index1++) {
			for(int index3=0;index3<primeArray.length;index3++) {
				  
				if(AlgorithmUtility.isAnagram(primeArray[index1], primeArray[index3])==true && index1!=index3) {
					  list.push(primeArray[index1]);	
				}

			}
		
		}
		
		int size = list.getListSize();
		for(int index=0;index<size;index++) {
			list1.push(list.peekSatck());
			list.pop();
		}
		
		list1.printSack();
		  
		
	}
}
