/******************************************************************************
 *  Purpose:  check Anagram or not in 2D array
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.arrayprogram;
import com.bridgelabz.util.AlgorithmUtility;

public class Anagram2DArray {

	public static void main(String[] args) {
		
		System.out.println("prime number : ");
		
		
		int range=AlgorithmUtility.scanInt();
		  int array[]=new int[range];
		 
		int primeArray[]= AlgorithmUtility.rangeOfPrimeNumber(array,range);
	
        int a=0,b=0;
        int[][] primeAnagram = new int[10][100]; 
        int rangeNumber=100;
		System.out.println("Anagram numbers is : ");
		for(int index1=0;index1<primeArray.length;index1++) {
			for(int index3=0;index3<primeArray.length;index3++) {
				  
				if(AlgorithmUtility.isAnagram(primeArray[index1], primeArray[index3]) && index1!=index3) {
					if(primeArray[index1]<rangeNumber) {
						
					   primeAnagram[a][b]=primeArray[index1];
					   System.out.print(primeAnagram[a][b]+" ");
					   b=b+1;
					}
					
					
				}
				if((primeArray[index1]) > rangeNumber) {
					
					rangeNumber = rangeNumber+100;
					a++;
					b=0;
					System.out.println();
				}
			}
			
			
		}
		
		  
	}

}
