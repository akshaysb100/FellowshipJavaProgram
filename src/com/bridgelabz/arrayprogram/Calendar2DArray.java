/******************************************************************************
 *  Purpose:  Calendar in 2D array
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.arrayprogram;

import com.bridgelabz.util.Utility;

public class Calendar2DArray {

	public static void main(String[] args) {
		
		System.out.println("Enter month : ");
        int month=Utility.scanInt();
        System.out.println("Enetr year : ");
        int year=Utility.scanInt();
        
        String[][] months1= {{" ","Januvary","Februvary","March","April",
      		 "May","June","Jully","Agust","September","Octomber","Novemsber","December"}};
       
        int [][] days1= {{0,31,28,31,30,31,30,31,31,30,31,30,31}};
        
		
		if(month==2 && Utility.leapYear(year)) {
			days1[0][month]=29;
		}
		
		
		 
        int d=Utility.dayOfWeek(1, month, year);
        System.out.println("day :"+d);
        System.out.println("");
        System.out.println("   "+months1[0][month]+" "+year);
        
        System.out.println("s  m  tu  w  th f  s");
        
       
        for(int i=0;i<d;i++)
        {
       	 System.out.print("   ");
        }
        
        for(int day1=1;day1<=days1[0][month];day1++)
        {
       
       	System.out.printf("%2d ",day1);
       	if(((day1+d)%7==0) || day1==days1[0][month])
       		System.out.println();
        }
	}

}
