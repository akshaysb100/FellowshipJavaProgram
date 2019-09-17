/******************************************************************************
 *  Purpose: Binary Search program for file Reader
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.algorithmprogram;

import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.AlgorithmUtility;
public class BinarySearchString {

	public static void main(String[] args) {
		 try {
	            FileReader reader = new FileReader("//home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/algorithmprogram/binaryFile.txt");
	            int character;
	            String s="";
			
	            for(character=0;(character=reader.read())!=-1;character++) {
	            	
	            	s=s+(char) character;
	            }
	          

	            String[] array=s.split(",");
	            AlgorithmUtility.bubbleSortStringValue(array);
	            String search = "or";
	            
		        System.out.println("Your file elements");
		        for(int i=0;i<array.length;i++) {
		           	   System.out.print(array[i]+" ");
		            	
		            }
		        System.out.println("");
	
		        int value;
		        value= AlgorithmUtility.binarySearchStringValue(array, search);
		        if(value>=0) {
		         for(int index=0;index<array.length;index++) {
		      	   if(array[index].equals(array[value])) {
		      		   System.out.println(array[value]+" : element is found on "+index+" index");
		      	   }
		         }
		       }else {
		      	 System.out.println("Element is not found : "+search);
		       }
	            
		        reader.close();
		        
		   } catch (IOException e) {
		     	      e.printStackTrace();
		     }

	}

}
