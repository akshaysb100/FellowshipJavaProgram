/******************************************************************************
 *  Purpose: A utility file which contains the logic of all the programs
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Utility {

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
	 * purpose : This function used for find second maximum element
	 * 
	 * @param maxArray : element of array
	 * @param length  : length of array
	 * @return : return second largest value
	 */
	public static int secondLargestNumber(int[] maxArray, int length) {
		
		int first=0,second=0;
		
		for(int index=0;index<length;index++) {
			
		    if(maxArray[index]>first) {
		    	second=first;
		    	first=maxArray[index];
		    }else if(maxArray[index]>second && maxArray[index]!=first) {
		    	second=maxArray[index];
		    	
		    }
		}
    return second;
		
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
	 * purpose :   This function used to find the leap year 
	 * 
	 * @param year any one year
	 * @return :return true or false
	 */
	
	public static boolean leapYear(int year) {
		//boolean year1=true;
       
		if((year%400)==0)//if year is divisible by 400  than it is leap year
         {
        	 //System.out.println("It is leap year");
        	return true;
         }
		else if ((year%4)==0) {

       	// System.out.println("It is leap year");
              return true;
		}
		else {
			 //System.out.println("It is not leap year");
			 return false;
		}
        
       
		
	}

	/**
	 * purpose : this fuction used to calculate power of two
	 * 
	 * @param number range of power
	 */
	public static void powerOfTwo(int number) {
		
		 int[] powerOfTwo=new int[number];
	     int sum=1;
	     for(int i=1;i<powerOfTwo.length;i++)
			{
				sum=sum*2;
				powerOfTwo[i]=sum;
			}
	     
		for(int i=1;i<powerOfTwo.length;i++)
		{
			//if((i%2)==0)
			System.out.println("2^"+i+"="+powerOfTwo[i]);
		}
	}

	/**
	 * purpose : this function used to calculate harmonic number
	 * 
	 * @param number : range of harmonic number
	 * @return : return harmonic value
	 */
	public static double harmonicNumber(double number) {
		
		double harmonicNumber=0;
		
		for(double i=1;i<=number;i++)
		{
			harmonicNumber=harmonicNumber+(1/i);
			//System.out.println(harmonicNumber);
		}
		return harmonicNumber;
	}

	/**
	 * purpose : This function is used to calculate head verses tail percentage  
	 * 
	 * @param number : How much time coin flip
	 */
	public static void flipCoin(int number) {
		double head=0,tail=0;
		float x;
		for(int i=0;i<number;i++)
		{
			x=(float)(Math.random());
			if(x>0.5)
			{
				head++;
			}else {
				tail++;
			}
		}
		
		System.out.println("head verses tail percentage");
		System.out.println("head percentage : "+((head/number)*100));
		System.out.println("tail percentage : "+((tail/number)*100));
		
	}
	

	/**
	 * @param stake : invested amount
	 * @param goal :  goal of amount
	 * @param trails: how much time you play
	 */
	public static void gamlingSimulation(int stake, int goal, int trails) {
		
		double winPercentage;
		 int win=0;
		
		 for(int i=0;i<trails;i++)
		 {
			 int cash=stake;
			 while(cash>0 && cash<goal) {
				
			 if(Math.random()<0.5)
			 {
				 cash++;
			 }else
			 {
				 cash--;
			 }
			 }
			 if(cash==goal) {
				 win++;
			 }
		 }
		 winPercentage=100.0*win/trails;
		 System.out.println("How much time win : "+win+" number of trails : "+trails);
		 System.out.println("win percentage : "+winPercentage);
		
		
	}

	/**
	 * purpose : this methode used to replace string
	 * 
	 * @param changeUser : array of string 
	 * @param name : user name
	 * @return : return user replace String
	 */
	public static String replaceString(String[] changeUser, String name) {
		String add="";
		for(int index=0;index<changeUser.length;index++) {
			if(changeUser[index].equals("UserName")) {
				changeUser[index]=name;
			}
		}
		for(int index=0;index<changeUser.length;index++) {
			add=add+changeUser[index]+" ";
		}

		//System.out.println(add);
		return add;
	}

	/**
	 * purpose : this fuction calculate coupon number
	 * @param number : number of cards
	 * @return : generated random number count
	 */
	public static int collect(int number) {
		 boolean[] isCollected = new boolean[number];  
	        int count = 0;                         
	        int distinct  = 0;                       
              Random random = new Random();
            number=number-1;
	        
	        while (distinct < number) {
	           
	           int value = 0+random.nextInt(number);
	        	count++;                             
	            if (!isCollected[value]) {          
	                distinct++;
	                isCollected[value] = true;
	            }
	        }
	        return count;
		
	}
	
	/**
	 *  purpose : This function calculate EuclideanDistance
	 * 
	 * @param firstValue  power of first value
	 * @param secondValue power of second value
	 * @return result
	 */
	public static int EuclideanDistance(int firstValue, int secondValue) {
		int result;
		result = (int) Math.sqrt(Math.pow(firstValue, 2)+Math.pow(secondValue, 2));
		return result;
	}

	
	/**
	 * purpose : This function is used quadratic equation
	 * 
	 * @param fistQuadraticValue    fistQuadraticValue for quadratic equation
	 * @param secondQuadraticValue  secondQuadraticValue for quadratic equation
	 * @param thirdQuadraticValue   thirdQuadraticValue for quadratic equation
	 */
	public static void quadratic(double fistQuadraticValue, double secondQuadraticValue, double thirdQuadraticValue) {
		double delta=Math.pow(secondQuadraticValue,2) - 4*fistQuadraticValue*thirdQuadraticValue;
		
		 if(delta > 0){
	            System.out.println("Roots are " + (-secondQuadraticValue+Math.sqrt(delta))/(2*fistQuadraticValue) + " and " + (-secondQuadraticValue-Math.sqrt(delta))/(2*fistQuadraticValue));
	        }else if (delta== 0){
	            System.out.println("Roots are " + -secondQuadraticValue/(2*fistQuadraticValue));
	        }
	        else{
	            System.out.println("Roots are " + -secondQuadraticValue/(2*fistQuadraticValue) + "+i" +Math.sqrt(-delta)/(2*fistQuadraticValue) + " and "+ -secondQuadraticValue/(2*fistQuadraticValue) + "-i" + Math.sqrt(-delta)/(2*fistQuadraticValue));
	        }
		
	}

	/**
	 * purpose : This function calculate National Weather Service
	 * 
	 * @param temperature 
	 * @param speed  
	 * @return result the result of weather
	 */
	public static double windChill(double temperature, double speed) {
		 double result=0;
		 if(temperature<50 && (speed<120 && speed>3)) {
			 result = 35.34+0.6215*temperature+(0.4275-35.75)*Math.pow(speed,0.16);
			return result;
		 }
	     else {
	    	 return result;
	    //	 System.out.println("the formula is not valid if temperatur is larger than 50 and if speed is larger than 120 or less than 3");
	    	 
	   }
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

	/**
	 * Purpose : This function used to find the prime fator of number
	 * 
	 * @param number : prime factorization number
	 */
	public static void primeFactor(int number) {
		for(int primeFactor=2;primeFactor<number;primeFactor++) {
			while(number%primeFactor==0) {
				System.out.print(primeFactor+" ");
				number=number/primeFactor;
			}
		}
		if(number>2) {
			System.out.print(number);
		}
		
	}

	/**
	 * purpose : this fuction used for three number addition is zero or not 
	 *
	 * @param array : integer array value 
	 */
	public static void sumOfResultZero(int[] array) {
        int sum=0; 
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array.length;j++) {
				
				for(int k=0;k<array.length;k++) {
					sum=0;
					if(i!=j && i!=k && j!=k) {
						sum=array[i]+array[j]+array[k];
						
						if(sum==0)
						{
							System.out.println(array[i]+" "+array[j]+" "+ array[k]);
						}
					}
					
				}
				
			}
		}
		
	}

	/**
	 * purpose : this function used elapsetime calculation
	 * 
	 * @return : epapsetime of system
	 */
	public static double stopWatch() {
		double elapsetime = 0;
		System.out.println("Enter 0 to start stopwatch");
		int start=Utility.scanInt();
		long startTime=0;
		long stopTime=0;
		
		if(start==0)
		{
			startTime=System.currentTimeMillis();
			System.out.print("Start timing is : ");
			System.out.println(startTime);
		}
		System.out.println("Enter 1 to stop stopwatch");
		int stop=Utility.scanInt();
		
		if(stop==1)
		{
			stopTime=System.currentTimeMillis();
			System.out.print("stop timing is : ");
			System.out.println(stopTime);
            elapsetime=(stopTime-startTime);
            System.out.println("Elapsetime : "+elapsetime);
		}

		return elapsetime;
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
	
	                   // Data structur Program
	
	/*
	 * 
	 * Linked list program start form here(Data Structur program)
	 * 
	 * 
	 */
	
	static Node head=null;
    static int size=0;
    
    
	/**
	 * purpose : Dynamically Add and Delete list 
	 * 
	 * @author admin Akshay
	 *
	 */
	static class Node{
   	    private String string;
   	    private Node next;
   	    
   	    public Node(){
   	    string=null;
   	    next=null;
   	    }
   	   
   	    public Node(String string,Node next) {
   	    this.string=string;
   	    this.next=next;
   	    }
    }
	
	
	 /**
	  * purpose : this function used to add string dydynamically
	  * 
	 * @param string : string element
	 */
	public static void addList(String string) {
	    	Node newNode=new Node();
	    	newNode.string=string;
	    	
	    	if(head==null) {
	    		head=newNode;
	    	}else {
	    	   Node	temp=head;
	    	   while(temp.next!=null) {
	    		   temp=temp.next;
	    	   }
	    	   temp.next=newNode;
	    	}
	    	size++;
	    }
	
	    
	    /**
	     * purpose : this function used for display the string elements in list
	     * 
	     */
	    public static void viewList() {
	    	
	    	if(head==null) {
	    		System.out.println("List is empty : ");
	    	}else {
	    		Node temp=head;
	    		while(temp!=null) {
	    			System.out.print(temp.string+" ");
	    			temp=temp.next;
	    		}
	    	}
	    }
	    
	    
	    /**
	     * purpose : this function used to delete first element in string list
	     * 
	     */
	    public static void deleteFirst() {
	    	if(head==null) {
	    		System.out.println("List is empty : ");
	    	}else {
	    		head=head.next;
	    	}
	    	size--;
	    }
	    
	    
	    /**
	     * purpose : this function used to delete last element in string list
	     * 
	     */
	    public static void deleteLast() {
	    	Node temp=head;
	    	for(int index=1;index<size-1;index++) {
	    		temp=temp.next;
	    	}
	    	temp.next=null;
	    	size--;
	    }
	    
	    
	    /**
	     * purpose : this function used to delete the element at position in string list
	     * 
	     * @param position : postion number of delete element
	     * 
	     */
	    public static void deleteAtPosition(int position) {
	    	if(position==1) {
	    		deleteFirst();
	    	}else if(position==size) {
	    		deleteLast();
	    	}else if(position>1 && position<=size-1){
	    		Node temp,temp1;
	    		temp=head;
	    		for(int index=1;index<position-1;index++) {
	    			temp=temp.next;
	    		}
	    		temp1=temp.next;
	    		temp.next=temp1.next;
	    		
	    	}else {
	    		System.out.println("position is not found : ");
	    	}
	    	size--;
	    }
	    
	    
	    /**
	     * purpose : this function used to search string element in list if string element is not found 
	     *           than add the string element in list else if string element is found than delete the
	     *           string element in list
	     *           
	     * @param string : serching element in list
 	     */
	    public static void searchData(String string) {
	    	Node temp=head;
	    	int count=0;
	    	int position=1;
	    	while(temp!=null) {
	    	if(temp.string.equals(string)) {
	    		count=1;
	    		deleteAtPosition(position);
	    	}
	    	position=position+1;
	    	temp=temp.next;
	      }
	    	if(temp==null && count==0) {
	    	  addList(string);
	    	}
	    	
	    }
	    
	    /**
	     * purpose : this function used to add string element in file using linke list
	     * 
	     */
	    public static void addFile() {
	    	try {
	    		 FileWriter write=new FileWriter("//home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructureprograms/SearchDeleteAdd.txt");
		            Node temp=head;
		            while(temp!=null) {
		            	write.write(temp.string+",");
		            	temp=temp.next;
		            }
		            write.close();
	    	}catch (Exception e) {
				System.out.println("Not write anythink in file : ");
			}
	    }

		

}
