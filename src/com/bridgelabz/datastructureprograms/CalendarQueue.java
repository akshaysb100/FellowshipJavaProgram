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
		DataStructurUtility<Integer> list2 = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list1 = new DataStructurUtility<Integer>();
		
		DataStructurUtility<String> months = new DataStructurUtility<String>();
		DataStructurUtility<String> months1 = new DataStructurUtility<String>();
		
		System.out.println("Enter month");
		int mon = list.scanInt();
		System.out.println("Enter year");
		int year = list.scanInt();
        
		
		 
        String[]month= {"Januvary","Februvary","March","April",
      		 "May","June","Jully","Agust","September","Octomber","Novemsber","December"};
		for(int index=0;index<month.length;index++) {
			months.enqueue(month[index]);
		}
		
		for(int index=0;index<month.length;index++) {
			months1.enqueue(months.peekQueue());
			months.dequeue();
		}
	//	months1.printDeque();
	
		String monthFront ="";
		for(int index=1;index<=12;index++) {
			if(mon==index) {
				monthFront = months1.peekFront();
			}
			months1.dequeue();
		}
	//	System.out.println("A month : " + monthFront);
		
		int [] days1= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int index=0;index<12;index++) {
			list.enqueue(days1[index]);
		}
		
		for(int index=0;index<12;index++) {
			list2.enqueue(list.peekQueue());
			list.dequeue();
		}
	
		int dayFront=0;
		for(int index=1;index<=12;index++) {
			if(mon==index) {
				dayFront = list2.peekFront();
			}
			list2.removeFront();
		}
	//	System.out.println("day of month : "+monthFront+" is "+ dayFront);
		
		
		
		if(mon==2 && Utility.leapYear(year)) {
			dayFront=29;
		}
		 
		  for(int day1=1;day1<=dayFront;day1++) {
			 list1.enqueue(day1);
		  }
		  int size=list1.getListSize();
		  size=size+1;
		  //System.out.println(" size "+size);
		  
		int day=Utility.dayOfWeek(1, mon, year);
		System.out.println("day of week is : "+day);
		System.out.println();
		System.out.println("   "+monthFront+" "+year);
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
	       	list1.dequeue();
	       	
	       	size--;
	        }
		    
	}

}
