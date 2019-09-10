/******************************************************************************
 *  Purpose : Stop Watch program 
 *
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class Stopwatch {

	public static void main(String[] args) {
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
            double elapsetime=(stopTime-startTime);
            System.out.println("Elapsetime : "+elapsetime);
		}


	}

}
