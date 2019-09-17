package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;

public class Sample1 {

	public static void main(String[] args) {
		
        System.out.println("number is : ");

        boolean value = AlgorithmUtility.isAnagram(17, 11);
        
        if(value==true) {
        	System.out.println("anagaram ");
        }else {
        	System.out.println("not");
        }
	}

}
