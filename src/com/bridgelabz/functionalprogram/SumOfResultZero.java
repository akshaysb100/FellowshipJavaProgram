/******************************************************************************
 *  Purpose : Sum of three Integer adds to ZERO
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

public class SumOfResultZero {

	public static void main(String[] args) {
		 

        System.out.println("Elements are hear : ");
		int array[]= {1,-1,0,1,2,-2,4,-4};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array.length;j++) {
				
				for(int k=0;k<array.length;k++) {
					sum=0;
					if(i!=j && i!=k && j!=k) {
						sum=array[i]+array[j]+array[k];
						
						if(sum==0)
						{
							System.out.println(array[i]+" "+array[j]+" "+ array[k]);
						}
					}
					
				}
				
			}
		}


	}

}
