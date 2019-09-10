/******************************************************************************
 *  Purpose : coupon number program  
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class CouponNumber {

	public static void main(String[] args) {
		
		 System.out.println("How much distinct coupon you have : ");
		  int number =Utility.scanInt();
	        int count = Utility.collect(number);
	        System.out.println(count+"­ total random number needed to have all distinct coupon numbers");

	}

}
