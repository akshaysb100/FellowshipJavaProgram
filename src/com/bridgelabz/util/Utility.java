/******************************************************************************
 *  Purpose: A utility file which contains the logic of all the programs
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.util;

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
		 //int bet=0;
		 for(int i=0;i<trails;i++)
		 {
			  
			 int cash=stake;
			 while(cash>0 && cash<goal) {
				//bet++;
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
	 * @return : return count
	 */

	public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }

	public static int collect(int number) {
		 boolean[] isCollected = new boolean[number];  
	        int count = 0;                         
	        int distinct  = 0;                       
             // Random random = new Random();
	        // repeat until you've collected all n card types
	        while (distinct < number) {
	            int value = getCoupon(number);    
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
		for(int i=0;i<=l-1;i++)
		{
		for(int j=0;j<=l-1;j++)
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
	 * @param array : 
	 * @param range
	 * @return
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
		return array;
		
	}
		

}
