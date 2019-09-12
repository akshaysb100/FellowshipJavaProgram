/******************************************************************************
 *  Purpose : Search,Add and delete element using linked list in file operation
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   12-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import java.io.FileReader;

import com.bridgelabz.util.Utility;
public class SearchDeleteAdd {

	public static void main(String[] args) {
try {
	
			FileReader reader=new FileReader("//home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructureprograms/SearchDeleteAdd.txt");
			    int character;
	            String split="";
			
	            for(character=0;(character=reader.read())!=-1;character++) {
	            	
	            	split=split+(char) character;
	            }
	            
	            String[] searchString = split.split(",");
	           
	            for(int index=0;index<searchString.length;index++) {
	            	   Utility.addList(searchString[index]);
	            }
	            System.out.println("List element of  file : ");
	            Utility.viewList();
	            
	            System.out.println();
	            System.out.println("if string is not found than add string else if string is found than delete string : ");
	            Utility.searchData("aa");
	            Utility.viewList();
	            
	            System.out.println();
	            System.out.println("if string is found than delete string else if string in not found than add string : ");
	            Utility.searchData("ap");
	            Utility.viewList();
	            
	            System.out.println();
	            System.out.println("Element is write in file : ");
	            Utility.viewList();
	            Utility.addFile();
	            
	            reader.close();
	          
		}catch (Exception e) {
			System.out.println("file is empty");
		}


	}

}
