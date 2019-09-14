package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.LinkedList;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.DataStructurUtility;
public class HashingFuntion {

	public static void main(String[] args) {
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		
		System.out.println("Enter value : ");
		int value = list.scanInt();
		DataStructurUtility<Integer> [] list1 = new DataStructurUtility[value];
		
		for (int i=0;i<value;i++)
			list1[i] = new DataStructurUtility<Integer>();
		
		     System.out.println("\nhow much number you enter in linked list : ");
	         int listNumber=list.scanInt();
		
		 while(listNumber>0) {
        	 System.out.println("Enter number : ");
        	 int addList = list.scanInt();
        	 int reminder = addList%value;
        	 
        	 list1[reminder].addRear(addList);
        	 listNumber--;
         }
		
		for(int index=0;index<value;index++) {
			System.out.print("list of "+index+" elements : ");
			list1[index].printHash();
			System.out.println();
		}		
		
	}

}
