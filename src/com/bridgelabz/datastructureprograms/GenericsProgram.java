/******************************************************************************
 *  Purpose: simple generic example
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;
import com.bridgelabz.util.MyGen;

public class GenericsProgram {

	public static void main(String args[]){  
		MyGen<Integer> m=new MyGen<Integer>();  
		
		m.add(2);  
		//m.add("vivek");//Compile time error  
		System.out.println(m.get()); 
		DataStructurUtility<Integer> list=new DataStructurUtility<Integer>();
		//DataStructurUtility<Integer,Integer> list2=new DataStructurUtility<Integer,Integer>();
	   // DataStructurUtility<String> list1=new DataStructurUtility<String>();
	    list.addFirst(1);
	    list.addLast(3);
	    list.addLast(2);
	    list.addLast(6);
	    list.addLast(5);
	    list.printList();
	    System.out.println();
	   // list1.addFirst("string");
	    list.inseartAtPosition(4, 3);
	    list.inseartAtPosition(8, 8);
	    list.printList();
	    

	    System.out.println();
	    list.sortList();
	    list.printList();
	    
	}  
}
