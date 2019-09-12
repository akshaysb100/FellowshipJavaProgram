/******************************************************************************
 *  Purpose: Vending machine program
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprogram;

import com.bridgelabz.util.AlgorithmUtility;
public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("Enter how much Amount you withdraw : ");
        int amount = AlgorithmUtility.scanInt();
        int note1000=0,note500=0,note100=0,note50=0,note20=0,note10=0,note1=0;
        while(amount>0) {
        	if(amount>=1000) {
        		note1000++;
        		amount=amount-1000;
        	}else if (amount>=500) {
				note500++;
				amount=amount-500;
			}else if (amount>=100) {
				note100++;
				amount=amount-100;
			}else if (amount>=50) {
				note50++;
				amount=amount-50;
			}else if (amount>=20) {
				note20++;
				amount=amount-20;
			}else if (amount>=10) {
				note10++;
				amount=amount-10;
			}else if (amount>=1) {
				note1++;
				amount=amount-1;
			}
        }
        
        System.out.println("notes of 1000 : "+note1000);
        System.out.println("notes of 500 : "+note500);
        System.out.println("notes of 100 : "+note100);
        System.out.println("notes of 50 : "+note50);
        System.out.println("notes of 20 : "+note20);
        System.out.println("notes of 10 : "+note10);
        System.out.println("notes of 1 : "+note1);
        
	}

}
