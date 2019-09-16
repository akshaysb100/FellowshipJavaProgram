/******************************************************************************
 *  Purpose:  using Queue crate calendar
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;
import com.bridgelabz.util.Utility;

public class CalendarQueue {

	public static void main(String[] args) {
		
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list1 = new DataStructurUtility<Integer>();
		
		DataStructurUtility<String> months = new DataStructurUtility<String>();
		
		System.out.println("Enter month");
		int month = list.scanInt();
		System.out.println("Enter year");
		int year = list.scanInt();
        
		
		 
        String[]months1= {"Januvary","Februvary","March","April",
      		 "May","June","Jully","Agust","September","Octomber","Novemsber","December"};
		for(int index=0;index<months1.length;index++) {
			months.addRear(months1[index]);
		}
	//	months.printDeque();
		
		String monthFront ="";
		for(int index=1;index<=12;index++) {
			if(month==index) {
				monthFront = months.peekFront();
			}
			months.removeFront();
		}
	//	System.out.println("A month : " + monthFront);
		
		int [] days1= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int index=0;index<12;index++) {
			list.addRear(days1[index]);
		}
	
		int dayFront=0;
		for(int index=1;index<=12;index++) {
			if(month==index) {
				dayFront = list.peekFront();
			}
			list.removeFront();
		}
	//	System.out.println("day of month : "+monthFront+" is "+ dayFront);
		
		
		
		if(month==2 && Utility.leapYear(year)) {
			dayFront=29;
		}
		 
		  for(int day1=1;day1<=dayFront;day1++) {
			 list1.addRear(day1);
		  }
		  int size=list1.getListSize();
		  size=size+1;
		  //System.out.println(" size "+size);
		  
		int day=Utility.dayOfWeek(1, month, year);
		System.out.println("day of week is : "+day);
		
		System.out.println("  "+monthFront+" "+year);
		System.out.println("s  m  tu  w  th f  s");
		for(int i=0;i<day;i++) {
			System.out.print("   ");
		}
		 
		//list1.printDeque();
		
		  for(int day1=1;day1<=dayFront;day1++) {
			  if(size==-1)
				  break;
			  
			  if(size>=1)
	       	System.out.printf("%2d ",list1.peekFront());
			  
	       	if(((day1+day)%7==0) || day1==dayFront)
	       		System.out.println();
	       	
	       	if(size>=1)
	       	list1.removeFront();
	       	
	       	size--;
	        }
		    
	}

}
