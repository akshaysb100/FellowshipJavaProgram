package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		
        System.out.println("Ente number");
        int number=Utility.scanInt();
       String binay= Utility.decimalToBinary(number);
        
        System.out.println("number : "+number+"\ndecimal to binary representation : "+binay);
	}
}
