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

import com.bridgelabz.util.DataStructurUtility;

public class SearchDeleteAdd {

	public static void main(String[] args) {
try {
	
	        DataStructurUtility<String> util=new DataStructurUtility<String>();
			FileReader reader=new FileReader("//home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructureprograms/SearchDeleteAdd.txt");
			    int character;
	            String s="";
			
	            for(character=0;(character=reader.read())!=-1;character++) {
	            	
	            	s=s+(char) character;
	            }
	            
	            String[] searchString = s.split(",");
	           
	            for(int index=0;index<searchString.length;index++) {
	            	   util.addList(searchString[index]);
	            }
	            System.out.println("List element of  file : ");
	            util.viewList();
	            
	            System.out.println();
	            System.out.println("if string is not found than add string else if string is found than delete string : ");
	            String string=util.scanString();
	            util.searchData(string);
	            util.viewList();
	            
	            System.out.println();
	            System.out.println("if string is found than delete string else if string in not found than add string : ");
	            String String1=util.scanString();
	            util.searchData(String1);
	            util.viewList();
	            
	            System.out.println();
	            System.out.println("Element is write in file : ");
	            util.viewList();
	            util.addFile();
	            
	            reader.close();
	          
		}catch (Exception e) {
			System.out.println("file is empty");
		}


	}

}
