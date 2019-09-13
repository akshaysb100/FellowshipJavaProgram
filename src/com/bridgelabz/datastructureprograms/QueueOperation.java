package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;

public class QueueOperation {

	public static void main(String[] args) {
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		
		list.enqueue(1);
		list.enqueue(5);
		list.enqueue(6);
		list.enqueue(4);
		System.out.println("print queue elements : ");
		list.printQueue();
		list.dequeue();
		list.printQueue();
		list.dequeue();
		list.printQueue();
		System.out.println();
		System.out.println("After deleting elements list is :");
        list.printQueue();
	}

}
