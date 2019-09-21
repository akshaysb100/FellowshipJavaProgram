/******************************************************************************
 *  Purpose: Inventory Managements Details program using json file
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jsonprogram;
import java.io.IOException;
import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;


public class InventoryManagement {

	public static void main(String[] args) throws IOException, IOException {
		
		
		InventoryDetails details = new InventoryDetails();
		String pathOfTransaction = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/inventoryJesonfile.json";
       
        InventoryDetails listOfDetails =  (InventoryDetails) JsonUtility.readMapper(pathOfTransaction, details);
	    System.out.println("Inventory Managements Details  : ");
	    int total = 0 ,total1=0;
	    boolean flag = true;
	    while(flag) {
	    	System.out.println("Enter your choice");
			System.out.println("1. RICE");
			System.out.println("2. PULSES");
			System.out.println("3. WHEAT");
			System.out.println("4. Exit");
			int choice = Utility.scanInt();
			
			switch (choice) {
			case 1 :
				
				
				 total=0;
				    System.out.println("Rice information : ");
				    
				    for(int i=0;i<listOfDetails.getRice().size();i++) {
				    	String name = listOfDetails.getRice().get(i).getName();
				    	System.out.println("name :"+name);
				    	int price = listOfDetails.getRice().get(i).getPrice();
				    	System.out.println("price : "+price);
				    	int weight = listOfDetails.getRice().get(i).getWeight();
				    	System.out.println("weight : "+weight);
				    	System.out.println("TOTAL PRICE = "+(price*weight));
				    	total =total+(price*weight);
				    	System.out.println();
				    }
				    System.out.println("TOTAL PRICE OF All RICE = "+total);
				    total1=total1+total;
				    System.out.println();

				      break;
			case 2:
				total=0;
				    System.out.println("Pulses information : ");
				    for(int i=0;i<listOfDetails.getPulses().size();i++) {
				    	String name = listOfDetails.getPulses().get(i).getName();
				    	System.out.println("name :"+name);
				    	int price = listOfDetails.getPulses().get(i).getPrice();
				    	System.out.println("price : "+price);
				    	int weight = listOfDetails.getPulses().get(i).getWeight();
				    	System.out.println("weight : "+weight);
				    	System.out.println("TOTAL PULSES = "+(price*weight));
				    	total =total+(price*weight);
				    	System.out.println();
				    }
				    System.out.println("TOTAL PRICE OF All PULSES = "+total);
				    total1=total1+total;
				    System.out.println();
				    break;
			case 3:
				total=0;
				System.out.println("Wheat information : ");
			    for(int i=0;i<listOfDetails.getWheat().size();i++) {
			    	String name = listOfDetails.getWheat().get(i).getName();
			    	System.out.println("name :"+name);
			    	int price = listOfDetails.getWheat().get(i).getPrice();
			    	System.out.println("price : "+price);
			    	int weight = listOfDetails.getWheat().get(i).getWeight();
			    	System.out.println("weight : "+weight);
			    	System.out.println("TOTAL PRICE = "+(price*weight));
			    	total =total+(price*weight);
			    	System.out.println();
			    }
			    System.out.println("TOTAL PRICE OF All WHEAT = "+total);
			    total1=total1+total;
			    System.out.println();
			    break;
			case 4:
				 System.out.println("Exit : ");
				 flag = false;
				  System.out.println("All Inventory price : "+total1);
				 break;
			default:
				System.out.println("wrong choice : ");
				break;
			}
	    }
	  
	}
}
