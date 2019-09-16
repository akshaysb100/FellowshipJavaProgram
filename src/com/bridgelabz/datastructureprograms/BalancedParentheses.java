/******************************************************************************
 *  Purpose: Simple Balanced Parentheses program for Arithmetic Expression 
 *  @author  Akshay
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;

public class BalancedParentheses {

	public static void main(String[] args) {
		 
		DataStructurUtility<String> list = new DataStructurUtility<String>();
		
		System.out.println("Enter arithmatic expression : ");
		String arithmeticExpression=list.scanString();
		
		String[] arithExpressions=arithmeticExpression.split("");
		
		for(int index=0;index<arithExpressions.length;index++) {
			System.out.print(arithExpressions[index]);
		}
		int size=0;
        for(int index=0;index<arithExpressions.length;index++) {
        	if(size==-1) {
        		break;
        	}
		    if(arithExpressions[index].equals("(")) {
			     list.push(arithExpressions[index]);
			     size++;
	     	}
		   else if(arithExpressions[index].equals(")")){
		    	if(size>=1) {
		    	list.pop();
		    	}
		    	size--;
		    	
		  }
     
		}
        System.out.println();
        if(size==0) {
        	System.out.println("parentheses is balanced");
        }else {
        	System.out.println("parentheses is not balanced");
        }
	}

}
