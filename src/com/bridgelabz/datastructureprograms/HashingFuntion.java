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
	
		for (int index=0;index<value;index++)
			list1[index] = new DataStructurUtility<Integer>();
		
		for(int index=0;index<value;index++) {
			list1[index].addRear(index);
		}
		
		for (int i = 0; i < list1.length; i++) {
			list1[i].printHash();
		}
	
		
		System.out.println();

		    System.out.println("\nhow much numbers you enter in linked list : ");
	         int listNumber=list.scanInt();
		
		 while(listNumber>0) {
        	 System.out.println("\nEnter number : ");
        	 int addList = list.scanInt();
        	 int reminder = addList%value;
        	 
        	 list1[reminder].addRear(addList);
        	 System.out.println();
        	// System.out.print("list of "+reminder+" elements : ");
        	 System.out.println();
        	 for(int index=0;index<value;index++) {
        		 System.out.print("list of "+index+" elements : ");
        		 list1[index].printHash();
        		 System.out.println();
        	 }
        	 
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
