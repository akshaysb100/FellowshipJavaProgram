/******************************************************************************
 *  Purpose: Using generic sort file elements using linked list
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.io.FileReader;

import com.bridgelabz.util.DataStructurUtility;

public class OrderList {

	public static void main(String[] args) {
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		DataStructurUtility<String> list1 = new DataStructurUtility<String>();
		
       try {
    	   FileReader reader = new FileReader("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructureprograms/UnorderListFile.txt");
    	   int character;
           String s="";
           
           for(character=0;(character=reader.read())!=-1;character++) {
        	    s=s+(char)character;   
           }
           String[] string=s.split(" ");
           int[] index = new int[string.length];
           
           for(int i=0;i<string.length;i++) {
        	   index[i]=Integer.parseInt(string[i]);
           }
           
           for(int i=0;i<index.length;i++) {
        	   list.addLast(index[i]);
           }
           
           list.printList();
           
           System.out.println("\nsort list order wise : ");
           list.sortList();
           list.printList();
           list.addLast(5);
           
           boolean value;
           System.out.println("\nEnter the element which one you found in the list : ");
           int foundNumber=list.scanInt();
           value= list.searchBoolean(foundNumber);
           if(value==true)
              System.out.println("Element found");
           else
        	   System.out.println("Element not found");
           
           list.addLast(18);
           list.sortList();
           list.printList();
           list.searchData(13);
           System.out.println("\nabove element is deleted in list : ");
           list.printList();
           System.out.println("\nlist element size : "+list.getListSize());
           list.addFile();
           
           //String operation
           
           list1.addLast("sh");
           list1.addLast("pk");
           list1.addLast("aa");
           list1.addLast("dg");
           System.out.println();
           list1.printList();
           boolean value1;
           System.out.println("\nEnter the element which one you found in the list : ");
           String foundString=list1.scanString();
           value1= list1.searchBoolean(foundString);
            if(value1==true)
               System.out.println("Element found");
            else
         	   System.out.println("Element not found");
           
           list1.addLast("za");
           list1.addLast("ls");
           list1.isEmpty();
           System.out.println("string");
           list1.sortList();
           list1.printList();
           System.out.println("\nlist element size : "+list1.getListSize());
           reader.close();
       }catch (Exception e) {
		// TODO: handle exception
	}
		
	}

}
