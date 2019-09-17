package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.DataStructurUtility;

public class AnagramQueue {

	public static void main(String[] args) {

        System.out.println("prime number : ");
		
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list1 = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list2 = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list3 = new DataStructurUtility<Integer>();
//		int range=AlgorithmUtility.scanInt();
//		  int array[]=new int[range];
//		 
//		int primeArray[]= AlgorithmUtility.rangeOfPrimeNumber(array,range);
//	
//		for(int i=0;i<primeArray.length;i++) {
//			System.out.println(primeArray[i]);
//		}
//		System.out.println("Anagram numbers is : ");
//		for(int index1=0;index1<primeArray.length;index1++) {
//			for(int index3=0;index3<primeArray.length;index3++) {
//				  
//				if(AlgorithmUtility.isAnagram(primeArray[index1], primeArray[index3])==true && index1!=index3) {
//					  list.enqueue(primeArray[index1]);	
//				}
//
//			}
//		
//		}
	
		boolean flag;
		int temp=0;
		for(int i=2;i<20;i++) {
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
		
		list.printQueue();
		int num1,num2;
		int size = list.getListSize();
		for(int i=1;i<=size;i++) {
			num1=list.peekQueue();
			for(int j=1;j<=size;j++) {
				num2=list.peekQueue();
				if(num1!=num2 & i!=j) {
					if(AlgorithmUtility.isAnagram(num1, num2) ) {
						list3.enqueue(num1);
					}
				}
			}
			list2.enqueue(list.peekQueue());
			list.dequeue();
		}
		

	}

}
