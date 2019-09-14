/******************************************************************************
 *  Purpose : Using deque check string is palindrom or not
 *  @author  Akshay
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;

public class Palindrome­Checker {

	public static void main(String[] args) {
		
		DataStructurUtility<String> list = new DataStructurUtility<String>();
		System.out.println("Eneter string : ");
		String palindromString = list.scanString();
		
		System.out.println("String is : " + palindromString);
		String[] string = palindromString.split("");
		
		for(int index=0;index<string.length;index++) {
			list.addRear(string[index]);
		}
        
		int length = string.length/2;
		int count=0,size=0;
		size=length;
		list.printDeque();
		System.out.println();
		for(int index=0;index<length;index++) {
			if(size==-1) {
				break;
			}
			if(list.peekFront().equals(list.peekRear())) {
				count++;
			}
			size--;
			if(size>=1) {
			list.removeFront();
			}
			if(size>=1) {
			list.removeRear();
			}
			
		}
		
		if(count==length){
			System.out.println(palindromString+" : String is palindrom");
		}else {
			System.out.println(palindromString+" : String is not palindrom");
		}
	
	}

}
