/******************************************************************************
 *  Purpose: cash counter program 
 *  @author  Akshay
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;

public class CashCounter {

	public static void main(String[] args) {
		
		DataStructurUtility<String> list = new DataStructurUtility<String>();
		
		System.out.println("Enter amount in bank : ");
        int sartingAmount=list.scanInt();
        System.out.println("Initial amount of bank is : "+sartingAmount);
        int choice;
       
        //boolean flag=true;
        System.out.println("how much people fornt of cash counter : ");
        int people=list.scanInt();
        System.out.println("enter people in queue : ");
        for(int index=1;index<=people;index++) {
        	list.enqueue(list.scanString());
        }
        int size = list.getListSize();
        for(int index=1;index<=size;index++) {
        	 System.out.println("this people front of cash counter");
        	 list.printQueue();
        	 boolean flag=true;
        do{
        	 flag=true;
        	 System.out.println("\nHi "+list.peekQueue());
        	System.out.println("Enter your choice \n1.cash deposit\n2.cash withdraw\n3.exit");
        	choice=list.scanInt();
        	
        	System.out.println(list.peekQueue()+" Enter how much amount you deposit or withdraw : ");
            int amount=list.scanInt();
        	switch(choice) {
        	case 1:
        		   sartingAmount=sartingAmount+amount;
        		   break;
        	case 2: 
        		   sartingAmount=sartingAmount-amount;
        		   break;
        	case 3:
        		   flag=false;
        		   break;
            default :
        	        System.out.println("wrong choice enter : ");
        	        list.dequeue();
        	       break;
        	}
        	System.out.println("bank amount is : "+sartingAmount);
            list.printQueue();
            System.out.println();
        }while(flag);
        	
        System.out.println("bank amount is : "+sartingAmount);
        list.dequeue();
        list.printQueue();
        System.out.println();
        
      }
        
	}

}
