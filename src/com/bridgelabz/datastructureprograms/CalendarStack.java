/******************************************************************************
 *  Purpose:  using Stack crate calendar
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructurUtility;
import com.bridgelabz.util.Utility;

public class CalendarStack {

	public static void main(String[] args) {
		DataStructurUtility<Integer> list = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list1 = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list2 = new DataStructurUtility<Integer>();
		DataStructurUtility<Integer> list3 = new DataStructurUtility<Integer>();
		DataStructurUtility<String> months = new DataStructurUtility<String>();
		DataStructurUtility<String> monthSatck = new DataStructurUtility<String>();
		
		System.out.println("Enter month");
		int month = list.scanInt();
		System.out.println("Enter year");
		int year = list.scanInt();
        
        String[]months1= {"Januvary","Februvary","March","April",
      		 "May","June","Jully","Agust","September","Octomber","Novemsber","December"};
        
		for(int index=0;index<months1.length;index++) {
			months.addRear(months1[index]);
		}
        String monthFront="";
        for(int index=1;index<=12;index++) {
        	monthSatck.push(months.peekRear());
        	months.removeRear();
        }
        monthSatck.printSack();
        for(int index=1;index<=12;index++) {
        	if(index==month) {
        	monthFront = monthSatck.peekSatck();
        	break;
        	}
        	monthSatck.pop();
        }
      
       System.out.println();
	    System.out.println(monthFront);
   
        int [] days1= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int index=0;index<12;index++) {
			list.addRear(days1[index]);
		}
		
        for(int index=1;index<=12;index++) {
        	list1.push(list.peekRear());
        	list.removeRear();
        }
        list1.printSack();
        
	
        int dayFront=0;
		for(int index=1;index<=12;index++) {
			if(month==index) {
				dayFront = list1.peekSatck();
			}
			list1.pop();
		}
       System.out.println();
		System.out.println(dayFront);
		
		
		if(month==2 && Utility.leapYear(year)) {
			dayFront=29;
		}
		 
		//insert instack
		  for(int day1=1;day1<=dayFront;day1++) {
			 list2.push(day1);
		  }
		
		  //insert in queue
		  for(int day1=1;day1<=dayFront;day1++) {
				list3.addRear(list2.peekSatck());
				list2.pop();
			  }
		 
		  
		  for(int day1=1;day1<=dayFront;day1++) {
				list2.push(list3.peekFront());
				list3.removeFront();
			  }
		 
				
	
		
		  int size=list2.getListSize();
		  size=size+1;
		  //System.out.println(" size "+size);
		
		int day=Utility.dayOfWeek(1, month, year);
		System.out.println("day of week is : "+day);
		
		System.out.println("  "+monthFront+" "+year);
		System.out.println("s  m  tu  w  th f  s");
		for(int i=0;i<day;i++) {
			System.out.print("   ");
		}
		
		
		 for(int day1=1;day1<=dayFront;day1++) {
			  if(size==-1)
				  break;
			  
			  if(size>=1)
	       	System.out.printf("%2d ",list2.peekSatck());
			  
	       	if(((day1+day)%7==0) || day1==dayFront)
	       		System.out.println();
	       	
	       	if(size>=1)
	       	list2.pop();
	       	
	       	size--;
	        }
		
	}

}
