/******************************************************************************
 *  Purpose:  Inventory Data write in json file
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jsonprogram;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class WritesInventoryData {

	public static void main(String[] args) {
			
		JSONObject root = new JSONObject();
	   
        List<Rice> listofRice = new ArrayList<Rice>(); 
		System.out.println("how much list enter : ");
		int number = Utility.scanInt();
		
		Rice rice1[] = new Rice[number];
		for(int index=0;index<number;index++) {
			rice1[index] = new Rice();
			System.out.println("Enter rice info : ");
			System.out.println("Enter rice name : ");
			String name = Utility.scanString();
			rice1[index].setName(name);;
			
			System.out.println("Enter rice price : ");
			int price = Utility.scanInt();
			rice1[index].setPrice(price);;
			
			System.out.println("Enter rice weight : ");
			int weight = Utility.scanInt();
			rice1[index].setWeight(weight);
			
			listofRice.add(rice1[index]);
			
			
		}
		List<Pulses> listofPulses = new ArrayList<Pulses>(); 
		Pulses pulses1[] = new Pulses[number];
		for(int index=0;index<number;index++) {
			pulses1[index] = new Pulses();
			System.out.println("Enter pulses info : ");
			System.out.println("Enter pulses name : ");
			String name = Utility.scanString();
			pulses1[index].setName(name);;
			
			System.out.println("Enter pulses price : ");
			int price = Utility.scanInt();
			pulses1[index].setPrice(price);;
			
			System.out.println("Enter pulses weight : ");
			int weight = Utility.scanInt();
			pulses1[index].setWeight(weight);
			
			listofPulses.add(pulses1[index]);
			
			
		}
		
		List<Wheat> listofWheat = new ArrayList<Wheat>(); 
		Wheat wheat[] = new Wheat[number];
		for(int index=0;index<number;index++) {
			wheat[index] = new Wheat();
			System.out.println("Enter wheat info : ");
			System.out.println("Enter wheat name : ");
			String name = Utility.scanString();
			wheat[index].setName(name);;
			
			System.out.println("Enter wheat price : ");
			int price = Utility.scanInt();
			wheat[index].setPrice(price);;
			
			System.out.println("Enter wheat weight : ");
			int weight = Utility.scanInt();
			wheat[index].setWeight(weight);
			
			listofWheat.add(wheat[index]);
			
			
		}
		root.put("wheat",listofWheat);
		root.put("pulses",listofPulses);
        root.put("rice", listofRice);
        
	    String jsonPath = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/inventoryJesonfile.json";
		JsonUtility.WriteVlueFile(jsonPath,root);
	
		System.out.println("===== Done =====");
	}

}
