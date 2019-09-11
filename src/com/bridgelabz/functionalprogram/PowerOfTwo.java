/******************************************************************************
 *  Purpose : Power of two 
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		
				int number = Integer.parseInt(args[0]);
				//int number=8;
			if( number>=0 && number<=31) {
			Utility.powerOfTwo(number);
			}else {
				System.out.println("Only works if 0 <=number<= 31 since 2^31 overflows an int");
			}
	}

}
