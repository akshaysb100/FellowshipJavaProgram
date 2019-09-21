/******************************************************************************
 *  Purpose: Inventory Details list 
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jsonprogram;

import java.io.Serializable;
import java.util.List;

public class InventoryDetails implements Serializable{

	private String Inventory;
	private List<Rice> rice;
	private List<Pulses> pulses;
	private List<Wheat> wheat;
	
	
	public String getInventory() {
		return Inventory;
	}
	public void setInventory(String inventory) {
		Inventory = inventory;
	}
	public List<Rice> getRice() {
		return rice;
	}
	public void setRice(List<Rice> rice) {
		this.rice = rice;
	}
	public List<Pulses> getPulses() {
		return pulses;
	}
	public void setPulses(List<Pulses> pulses) {
		this.pulses = pulses;
	}
	public List<Wheat> getWheat() {
		return wheat;
	}
	public void setWheat(List<Wheat> wheat) {
		this.wheat = wheat;
	}
	
	
	
}
