/******************************************************************************
 *  Purpose: A utility file which contains the logic of all Algorithm programs
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Scanner;

public class AlgorithmUtility {
	
	 static Scanner scanner=new Scanner(System.in);
		
	    /**
	     * purpose : create function to Accept the integer values from user
	     * 
	     * @return : value return integer value
	     */
	    
	    public static int scanInt() {
	      int value = scanner.nextInt();
		return value;
		}

	    
	    /**
	     * purpose : create function to Accept the String values from user
	     * 
	     * @return : value return String value
	     */
	    
	    public static String scanString() {
	    	String value = scanner.next();
	    	return value;
	    }
	    public static double scanDouble() {
	    	double value=scanner.nextDouble();
	    	return value;
	}
	    
	/**
	 * purpose : this function is used to check strings are anagram or not
	 * @param string1 : Anagram string first
	 * @param string2 : Anagram string second
	 * @return return result anagram or not  
	 */
	public static boolean Anagram(String string1, String string2) {	 
		int count=0;
		boolean result;
		int l=string1.length();
		int l1=string2.length();
		
		//System.out.println("length : "+l+" "+l1);
		if(l==l1) {
		for(int i=0;i<l;i++)
		{
		for(int j=0;j<l;j++)
			{
				if(string1.charAt(i)==string2.charAt(j))
				{
					count++;
					//System.out.println(count);
					break;
				}
			}
		}
		if(count==l)
			result = true;
			//System.out.println("anagram string");
		else {
			result = false;
			//System.out.println("not anagram string");
		}
		
	}else {
		result=false;
	}
		return result;
	}
	
	
	/**
	 * purpose : this fuction checked palindrom string
	 * 
	 * @param palindromeString : string 
	 * @return : return trur or false
	 */
	public static boolean palindrom(String palindromeString) {
		int index1=0,count=0;
		for(index1=0;index1<palindromeString.length();index1++)
		{
			
			
			if(palindromeString.charAt(index1)==palindromeString.charAt((palindromeString.length()-1)-index1)){
				count++;
			}
		}

		if(count==palindromeString.length())
		{
			return true;
					
		}else {
			return false;
		}
		
		
		
	}
	
	
	/**
	 * purpose : This function find out day of week
	 * 
	 * @param  day    day of month
	 * @param  month  month of year
	 * @param  year   which one year
	 * @return day1  day of week 
	 */
	public static int dayOfWeek(int day, int month, int year) {
		int day1,month1,year1;
		  int year3;//find leap year or not
		  year1=year-(14-month)/12;
		  year3=year1+year1/4-year1/100+year1/400;
		  month1=month+12*((14-month)/12)-2;
		  day1=(day+year3+(31*month1)/12)%7;
		
		  return day1;
		
	}

	/**
	 * purpose : this method used to convert decimal number into binary number
	 * @param number : positive number
	 * @return : binary conversion
	 */
	public static String decimalToBinary(int number) {
		 String binay="";
	        while(number>0) {
	      	  binay=(number%2)+binay;
	      	  number=number/2;
	        }
	       
	        return binay;
	}
	
	
	/**
	 * purpose : this method used to sort integer value using bubble sort
	 * 
	 * @param bubbleSortArray
	 */
	public static void bubbleSortIntegerValue(int bubbleSortArray[]) {
		int temp;
		for(int index=0;index<bubbleSortArray.length;index++) {
			for(int index1=0;index1<bubbleSortArray.length;index1++) {
				if(bubbleSortArray[index1]>bubbleSortArray[index]) {
				temp=bubbleSortArray[index];
			    bubbleSortArray[index]=bubbleSortArray[index1];
			    bubbleSortArray[index1]=temp;
				}
			}
		}
	}
	
	
	/**
	 * purpose : this method used to sort string value using bubble sort
	 * 
	 * @param bubbleSortArray
	 */
	public static void bubbleSortStringValue(String bubbleSortArray[]) {
		String temp;
		for(int index=0;index<bubbleSortArray.length;index++) {
			for(int index1=0;index1<bubbleSortArray.length;index1++) {
				if(bubbleSortArray[index].compareTo(bubbleSortArray[index1])<0) {
					temp=bubbleSortArray[index];
					bubbleSortArray[index]=bubbleSortArray[index1];
					bubbleSortArray[index1]=temp;
				}
			}
		}
	}
	
	
	/** purpose : this method used to sort integer value using insertion sort
	 * 
	 * @param insertionArray : integer array value
	 * @param size : length of array
	 */
	public static void insertionSortIntegerValue(int insertionArray[],int size) {
		int temp;
		int postion;
		for(int index=0;index<size;index++) {
			postion=index;
			for(int index1=index+1;index1>=0;index1--) {
				if(index1<size && postion>=0)
				if(insertionArray[postion]>insertionArray[index1]) {
					temp=insertionArray[postion];
					insertionArray[postion]=insertionArray[index1];
					insertionArray[index1]=temp;
				}
				postion=postion-1;
			}
		}
		
	}
	
	
	/** purpose : this method used to sort string value using insertion sort
	 * 
	 * @param array : string value array
	 * @param size : length of array
	 */
	public static void insertionSortString(String[] array, int size) {
		  String temp;
		  int postion=0;
		  for(int i=0;i<size;i++){
			  postion=i;
			  for(int j=i+1;j>=0;j--){	  
				 if(j<size && postion>=0)
			  if(array[postion].compareTo(array[j])>0){
			  temp = array[postion];
			  array[postion]=array[j];
			  array[j]=temp;
			  }
				 postion=postion-1;
			  }
		  }
	}
	
	
	/**
	 * purpose : this method used to search integer value using binary search
	 * 
	 * @param lowerValue : initial value
	 * @param key        : finding element
	 * @param highValue  : ending value 
	 * @return : return your finding number
	 */
	public static int binarySearchIntValue(int array[],int lowerValue,int key,int highValue) {
		int mid;
		int flag=0;
		while(lowerValue<=highValue) {
			mid=(lowerValue+highValue)/2;
			if(array[mid]==key) {
				flag=1;
				return key;
			}else if(array[mid]<key) {
				lowerValue=mid+1;
			}else {
				highValue=mid-1;
			}
		}
		if(lowerValue>highValue) {
			return flag;
		}
	 return flag;
	}

	/**
	 * purpose : this method used to search string value using binary search
	 * 
	 * @param stringArray : string array type
	 * @param key         : your element
	 * @return : return your finding element
	 */
	public static int binarySearchStringValue(String stringArray[],String key) {
		int low=0;
		int high=stringArray.length;
		int mid;
		while (low <= high) {
            mid = (low + high) / 2;

            if (stringArray[mid].compareTo(key) < 0) {
                low = mid + 1;
            } else if (stringArray[mid].compareTo(key) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
	}
	
	
	/**
	 * purpose : this function is used calculates the monthly payments on loan
	 * 
	 * @param principalAmount principal loan amount
	 * @param year    how much year
	 * @param rate    how much rate to year
	 */

	public static void monthlyPayment(double principalAmount, double year, double rate) {
		rate = rate/(12*100);
	     double month=12*year;
	     
	     principalAmount =(principalAmount*rate)/1-(Math.pow(1+rate,(-month)));
	     System.out.println("Monthly interest : "+principalAmount);
		
	}
	
	
	/**
	 * purpose : this fuction used to check number are prime number or not 
	 * 
	 * @param array : positive integer number
	 * @param range : range of positive number
	 * @return : return prime number
	 */
	public static int[] rangeOfPrimeNumber(int[] array, int range) {
		int count=0;
		int number=0;
		int index,number1;
		
		for(index=0;index<=array.length;index++) {
			number=index; 
			for(number1=2;number1<number;number1++)
			{
				if(number%number1==0)
				{
				 break;
				}
			}
			
			if(number1==number)
			{
				  array[count]=number;
				count++;
			}
		}
		int primeArray[]=new int[count];
		
		for(index=0;index<count;index++) {
			primeArray[index]=array[index];
		}
		return primeArray;
		
	}

	/**
	 * purpose :  This function used temperature Conversion
	 * 
	 * @param celsius    pass celsius value
	 * @param fahrenheit pass fahrenheit value
	 */
	public static void temperaturConversion(double celsius, double fahrenheit) {
		int choice;
        System.out.println("Enter your choice \n 1:Celsius to Fahrenheit :\n 2:Fahrenheit to Celsius :");
        choice=Utility.scanInt();
        switch(choice)
        {
        case 1:
      	      System.out.println("Celsius to Fahrenheit : "+ (celsius*(9/5))+32 );
      	      break;
        case 2:
      	      System.out.println("Fahrenheit to Celsius : "+(fahrenheit-32)*(5/9));
      	      break;
        default:
      	  System.out.println("Wrong Choice");
        
        }
		
	}
	
	

}
