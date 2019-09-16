/******************************************************************************
 *  Purpose : hashing function program
 *  @author  Akshay
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;


import com.bridgelabz.util.DataStructurUtility;
public class HashingFuntion {

	public static void main(String[] args) {
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();	
		
		System.out.println("Enter value : ");
		int value = list.scanInt();
		DataStructurUtility<Integer> [] list1 = new DataStructurUtility[value];
	
		for(int index=0;index<value;index++) {
			list.addRear(index);
		}
		
		list.printHash();
		System.out.println();

		
		for (int index=0;index<value;index++)
			list1[index] = new DataStructurUtility<Integer>();
		
		     System.out.println("\nhow much number you enter in linked list : ");
	         int listNumber=list.scanInt();
		
		 while(listNumber>0) {
        	 System.out.println("\nEnter number : ");
        	 int addList = list.scanInt();
        	 int reminder = addList%value;
        	 
        	 list1[reminder].addRear(addList);
        	 System.out.println();
        	 System.out.print("list of "+reminder+" elements : ");
        	 list1[reminder].printHash();
        	 listNumber--;
         }
		
		 System.out.println();
		for(int index=0;index<value;index++) {
			System.out.print("list of "+index+" elements : ");
			list1[index].printHash();
			System.out.println();
		}		
		
	}

}
