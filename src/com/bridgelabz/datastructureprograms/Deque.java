/******************************************************************************
 *  Purpose : Deque implementation using linked list 
 *  @author  Akshay
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;

public class Deque {

	public static void main(String[] args) {
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
 
		list.addRear(5);
		list.addRear(6);
		list.addRear(7);
		list.printDeque();
		System.out.println("front is : "+list.peekFront());
        System.out.println("rear is : "+list.peekRear());
        
		System.out.println();
		list.addFront(1);
		list.printDeque();
		System.out.println("front is : "+list.peekFront());
        System.out.println("rear is : "+list.peekRear());
		list.addFront(2);
		list.addFront(3);
		System.out.println();
		list.printDeque();
		System.out.println("front is : "+list.peekFront());
        System.out.println("rear is : "+list.peekRear());

        System.out.println();
		list.removeFront();
		list.printDeque();
		System.out.println("front is : "+list.peekFront());
        System.out.println("rear is : "+list.peekRear());
        System.out.println("size of elements in list : "+list.getListSize());
      
        System.out.println();
        list.removeRear();
		list.printDeque();
		System.out.println("front is : "+list.peekFront());
        System.out.println("rear is : "+list.peekRear());
        System.out.println(list.getListSize());
       	
	
	}

}
