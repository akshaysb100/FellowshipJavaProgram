/******************************************************************************
 *  Purpose:  Computer information
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   27-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.factorypattern;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
	   return "RAM= "+this.getRAM()+", HDD= "+this.getHDD()+", CPU="+this.getCPU();
	}
}
