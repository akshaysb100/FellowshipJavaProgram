/******************************************************************************
 *  Purpose : Gamling Problem
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.util.Utility;

public class GamlingSimulator {

	public static void main(String[] args) {
		 int stake,goal,trails;
		 System.out.println("How much amount you invested");
		 stake=Utility.scanInt();
		 System.out.println("goal of amount");
		 goal=Utility.scanInt();
		 System.out.println("trails");
		 trails=Utility.scanInt();

		 Utility.gamlingSimulation(stake,goal,trails);
	}

}
