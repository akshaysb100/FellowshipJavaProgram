/******************************************************************************
 *  Purpose:  Inventory Data write in json file
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jsonprogram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;


import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class WritesInventoryData {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
			
	//	JSONObject root = new JSONObject();
	  
		InventoryDetails details = new InventoryDetails();
		String pathOfTransaction = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/inventoryJesonfile.json";
      
        List<Rice> listofRice = new ArrayList<Rice>(); 
        List<Pulses> listofpulses = new ArrayList<Pulses>();
        List<Wheat> listofwheat = new ArrayList<Wheat>();
        
        File file = new File(pathOfTransaction);
        
        
        System.out.println("how much list enter : ");
		int number = Utility.scanInt();
		
		
		Rice rice1 = new Rice();
		
			if (file.length() != 0) {
				details = (InventoryDetails) JsonUtility.readMapper(pathOfTransaction, details);
			}
			
			if(file.length() != 0) {
				
			if (!details.getRice().isEmpty()) {
				listofRice.addAll(details.getRice());
			}
			if (!details.getRice().isEmpty()) {
				listofpulses.addAll(details.getPulses());
			}
			if (!details.getRice().isEmpty()) {
				listofwheat.addAll(details.getWheat());
			}
			}
			System.out.println("Enter rice info : ");
			System.out.println("Enter rice name : ");
			String name = Utility.scanString();
			rice1.setName(name);
			
			System.out.println("Enter rice price : ");
			int price = Utility.scanInt();
			rice1.setPrice(price);;
			
			System.out.println("Enter rice weight : ");
			int weight = Utility.scanInt();
			rice1.setWeight(weight);
			
			listofRice.add(rice1);
			
			
		
		
		List<Pulses> listofPulses = new ArrayList<Pulses>(); 
		Pulses pulses = new Pulses();
		
			
			System.out.println("Enter pulses info : ");
			System.out.println("Enter pulses name : ");
		    name =Utility.scanString();
			pulses.setName(name);
			
			System.out.println("Enter pulses price : ");
		    price = Utility.scanInt();
			pulses.setPrice(price);;
			
			System.out.println("Enter pulses weight : ");
			 weight = Utility.scanInt();
			pulses.setWeight(weight);
			
			listofPulses.add(pulses);
			
			
	
		
		List<Wheat> listofWheat = new ArrayList<Wheat>(); 
		Wheat wheat = new Wheat();
		for(int index=0;index<number;index++) {
			wheat= new Wheat();
			System.out.println("Enter wheat info : ");
			System.out.println("Enter wheat name : ");
			 name = Utility.scanString();
			wheat.setName(name);
			
			System.out.println("Enter wheat price : ");
			 price = Utility.scanInt();
			wheat.setPrice(price);;
			
			System.out.println("Enter wheat weight : ");
		    weight = Utility.scanInt();
			wheat.setWeight(weight);
			
			listofWheat.add(wheat);
			
			
		}
	//	root.put("wheat",listofWheat);
		//root.put("pulses",listofPulses);
		
		details.setRice(listofRice);
		details.setPulses(listofPulses);
		details.setWheat(listofWheat);
		details.setInventory("list");
		JsonUtility.writeMapper(pathOfTransaction, details);
		System.out.println("===== Done =====");
	}

}
