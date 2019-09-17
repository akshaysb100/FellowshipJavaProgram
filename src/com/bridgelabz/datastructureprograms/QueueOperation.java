/******************************************************************************
 *  Purpose:  Queue Operations
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;

public class QueueOperation {

	public static void main(String[] args) {
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		
		list.enqueue(1);
		list.enqueue(5);
		list.enqueue(6);
		list.enqueue(4);
		list.enqueue(3);
		
		System.out.println("print queue elements : ");
		list.printQueue();
	  
		list.dequeue();
		list.enqueue(18);
		System.out.println("after deleting queue : ");
		list.printQueue();
		System.out.println("after deleting queue : ");
		list.dequeue();
		list.printQueue();
		System.out.println();
		System.out.println("After deleting elements list is :");
        list.dequeue();
        
      //  
        list.printQueue();
        list.enqueue(12);
        System.out.println("After adding elements : ");
        list.printQueue();
	}

}
