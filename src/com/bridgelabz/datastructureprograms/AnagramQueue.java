/******************************************************************************
 *  Purpose:  Anagram using Queue operations
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.DataStructurUtility;

public class AnagramQueue {

	public static void main(String[] args) {

        System.out.println("prime number : ");
		
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list2 = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list3 = new DataStructurUtility<Integer>();

		boolean flag;
		int temp=0;
		for(int i=2;i<100;i++) {
		 	flag=true;
		 	  temp=i;
		 	for(int j=2;j<temp;j++) {
		 		if(temp%j==0) {
		 			flag=false;
		 			break;
		 		}
		 	}
		 	if(flag==true) {
		 		list.enqueue(i);
		 	}
		}
		int number;
		for(int i=0;i<100;i++) {
			number=list.peekQueue();
			list2.enqueue(number);
			list.enqueue(number);
			list.dequeue();
		}
		
		System.out.println(list.peekQueue());
		System.out.println(list.peekRear());
		
		
		int num1,num2;
		int size = list.getListSize();
		System.out.println("size : "+size);
		for(int i=1;i<=size;i++) {
			num1=list.peekQueue();
			
			for(int j=1;j<=size;j++) {
				num2=list2.peekQueue();
				
				if(num1!=num2 & i!=j) {
					boolean value=AlgorithmUtility.isAnagram(num1, num2);
			
					if(value==true ) {
						
						list3.enqueue(num1);
					}
				}
				list2.enqueue(list2.peekQueue());
				list2.dequeue();
			}
			list.enqueue(list.peekQueue());
			list.dequeue();
		}
		
 	System.out.println("Anagram String is : ");	
	list3.printQueue();

	}

}
