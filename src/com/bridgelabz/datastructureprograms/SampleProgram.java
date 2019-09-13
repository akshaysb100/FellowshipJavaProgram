/******************************************************************************
 *  Purpose : sample linked list programs
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   12-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;

public class SampleProgram {

	public static void main(String[] args) {
	  
		DataStructurUtility<Integer> util=new DataStructurUtility<Integer>();
		System.out.println("lsit of elements :");
		
		 util.addLast(1);
		 util.addLast(5);
		 util.addLast(2);
		 util.addLast(4);
		 util.addLast(6);
		 util.addLast(3);
		 util.printList();
		 
		 System.out.println();
		 System.out.println("Update list : ");
		 util.deleteFirst();
		 util.printList();
		 
		 System.out.println();
		 System.out.println("Update list : ");
		 util.deleteLast();
		 util.printList();
		 
		 System.out.println();
		 System.out.println("Update list : ");
		 util.deleteAtPosition(3);
		 util.printList();
		 
		 System.out.println();
		 System.out.println("Update list : ");
		 util.search(7);
		 util.printList();
		 
		 System.out.println();
		 System.out.println("Update list : ");
		 util.search(6);;
		 util.printList();
		 
		 System.out.println();
		 System.out.println("Update list : ");
		 util.addFirst(8);
		 util.printList();
		 
		 System.out.println();
		 System.out.println("Update list : ");
		 System.out.println("Find index number of your number : ");
		 System.out.println("Eneter the number : ");
		 int number=util.scanInt();
		 int index = util.index(number);
		 System.out.println("your list is : ");
		 util.printList();
		 
		 if(index!=0) {
		 System.out.println("\nindex number of "+number+" is : "+index);
		 }else {
			 System.out.println("\n"+number+ " number is not in this list : ");
		 }
		 
		 
	}

}
