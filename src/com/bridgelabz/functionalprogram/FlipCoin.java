/******************************************************************************
 *  Purpose:  calculates percentage of Head verses Tail.
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		
		System.out.println("How much time coin flip :");
		int number=Utility.scanInt();
		Utility.flipCoin(number);

	}

}
