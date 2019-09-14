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
        int startingAmount=list.scanInt();
        System.out.println("Initial amount of bank is : "+startingAmount);
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
        	 boolean flag;
        	 int amount;
        do{
        	 flag=true;
        	 System.out.println("bank amount is : "+startingAmount);
        	 System.out.println("\nHi "+list.peekQueue());
        	System.out.println("Enter your choice \n1.cash deposit\n2.cash withdraw\n3.exit");
        	choice=list.scanInt();
  
        	switch(choice) {
        	case 1:
        		System.out.println(list.peekQueue()+" Enter how much amount you deposit : ");
        			amount = list.scanInt();
        			startingAmount=startingAmount+amount;
        		   break;
        	case 2: 
        		System.out.println(list.peekQueue()+" Enter how much amount you withdraw : ");
        		amount = list.scanInt();
        		startingAmount=startingAmount-amount;
        		   break;
        	case 3:
        		   flag=false;
        		   list.dequeue();
        		 
        		   break;
            default :
        	        System.out.println("wrong choice enter : ");
        	        
        	       
        	}
        	
            
            System.out.println();
        }while(flag);
        	
        System.out.println("bank amount is : "+startingAmount);
      
        list.printQueue();
        System.out.println();
        
      }
        
	}

}
