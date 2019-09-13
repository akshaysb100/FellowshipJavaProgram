/******************************************************************************
 *  Purpose: Stack operation using linked list in generic
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;

public class StackOperations {

	public static void main(String[] args) {
		DataStructurUtility<Integer> list =new  DataStructurUtility<Integer>();
		DataStructurUtility<String> list1 =new  DataStructurUtility<String>();
		
		// for Integer value
		list.push(3);
		list.push(1);
		list.push(4);
		list.push(5);
		list.push(8);
		System.out.println("Stack element in list : ");
		list.printSack();
		System.out.println("\n"+list.peek()+" is Top element in list ");
		System.out.println("size of list is "+list.getListSize());
		list.pop();
		list.pop();
		System.out.println("Delete element in list : ");
		list.printSack();
		System.out.println();
		list.isEmptySatck();
		System.out.println(list.peek()+" is Top element in list ");
		System.out.println("size of list is "+list.getListSize());

		//for String value
		
		list1.push("ak");
		list1.push("dk");
		list1.push("zk");
		list1.push("mk");
		list1.push("bs");
		System.out.println("Stack element in list : ");
		list1.printSack();
		System.out.println("\n"+list1.peek()+" is Top element in list ");
		System.out.println("size of list is "+list1.getListSize());
		list1.pop();
		list1.pop();
		System.out.println("Delete element in list : ");
		list1.printSack();
		System.out.println();
		System.out.println(list1.peek()+" is Top element in list ");
		System.out.println("size of list is "+list1.getListSize());
		list1.isEmptySatck();
	}

}
