/******************************************************************************
 *  Purpose: Decimal to binary conversion
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		
        System.out.println("Ente number");
        int number=AlgorithmUtility.scanInt();
       String binay= AlgorithmUtility.decimalToBinary(number);
        
        System.out.println("number : "+number+"\ndecimal to binary representation : "+binay);
	}
}
