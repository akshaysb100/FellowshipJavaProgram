/******************************************************************************
 *  Purpose: 
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   27-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.factorypattern;

public class TestFactorysMain {

	public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		
		System.out.println("Factory PC Config : "+pc);
		System.out.println();
		System.out.println("Factory Server Config : "+server);
	}
}
