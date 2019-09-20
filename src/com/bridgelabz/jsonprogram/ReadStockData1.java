/******************************************************************************
 *  Purpose: Stock Managements Details program using json file
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
import java.util.Collection;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class ReadStockData1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		File file = new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json");
		ObjectMapper mapper = new ObjectMapper();
	//	StockDetails stockDetails = mapper.readValue(new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json"), StockDetails.class);
        int value;
	 //  Stock stockDetails1 = mapper.readValue("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json", );
		

    //    String jsonPath = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json";
	//	List<Stock> temp  = mapper.readValue(jsonPath, new TypeReference<List<Stock>>(){});
        List<Stock> stockList = new ArrayList<Stock>();
        List<Stock> stockData = new JSONArray();
		System.out.println("Company Details  : ");
	    int total = 0 ,total1=0;
	    int totalsize=0;
	    boolean flag = true;
	    while(flag) {
	    	System.out.println("Enter your choice");
			System.out.println("1. Stock");
			System.out.println("2. Add Stock");
			System.out.println("3. Exit");
			int choice = Utility.scanInt();
			switch (choice) {
			case 1:
				
				List<Stock> tempList = new ArrayList<Stock>();
				tempList = mapper.readValue(file, new TypeReference<List<Stock>>() {});
				for(Stock temp1: tempList)
				{
					String name = temp1.getStockName();
					System.out.println("name of company : "+name);
					int price = temp1.getSharePrice();
					System.out.println("Number of share : "+price);
					int numberOfShare = temp1.getNumberOfShares();
					System.out.println("Share price : "+numberOfShare);
					
					total=price*numberOfShare;
					System.out.println("Total share price : "+total);
					System.out.println();
				}
				
//				  System.out.println("company information");
//				  for( value=0;value<3;value++) {
//					  System.out.println("Enter "+value+" for "+stockDetails.getStock().get(value).getStockName());
//				  }
//				    int number = Utility.scanInt();
//				  
//				  System.out.println();
//				  for(int index=number;index<=number;index++) {
//					  total = 0;
//					  System.out.println("company name : "+stockDetails.getStock().get(index).getStockName());
//					  int numberOfShare = stockDetails.getStock().get(index).getNumberOfShares();
//					  System.out.println("Number of share : "+numberOfShare);
//					  int price = stockDetails.getStock().get(index).getSharePrice();
//					  System.out.println("Share price : "+price);
//					  total =total+(price*numberOfShare);
//					  System.out.println("Total share price : "+total);
//				      System.out.println();
//				  }
				 break;
			case 2:
				
				
			    AddStock add = new AddStock();
			    
			   add.addStock();
			   totalsize=totalsize+1;
				
//				  JSONObject root = new JSONObject();
////		           File file = new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json");
////		   		
////		   	 	    List<Stock> stockData1 = new JSONArray();
////				    List<Stock> tempList = new ArrayList<Stock>();
////					tempList = mapper.readValue(file, new TypeReference<List<Stock>>() {});
////				
//					
//				//	File file = new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json");
//
//					//List<Stock> tempList = new ArrayList<Stock>();
//					//tempList = mapper.readValue(file, new TypeReference<List<Stock>>() {});
//					
//				//	stockList.addAll(tempList);
//				  
//				String jsonPath = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json";
//				 	
//				    int	size = 1;
//					totalsize=totalsize+1;
//				//	stockData.addAll(tempList);
//				 	Stock stock[] = new Stock[totalsize];
//					for(int index=0;index<1;index++) {
//						stock[index] = new Stock();
//						
//						System.out.println("Enter company name : ");
//						String stockName = Utility.scanString();
//						stock[index].setStockName(stockName);
//						
//						System.out.println("How much share of company : ");
//						int numberOfShares = Utility.scanInt();
//						stock[index].setNumberOfShares(numberOfShares);
//						
//						System.out.println("Enter one share price : ");
//						int sharePrice = Utility.scanInt();
//						stock[index].setSharePrice(sharePrice);;
//						
//						
//						stockData.add(stock[index]);
//						
//						
//					}
//				
//					root.put("stock", stockData);
//			      
//					JsonUtility.WriteVlueFile(jsonPath,root);
					break;
			case 3:
				System.out.println("Exit : ");
				flag = false;
				
				break;

			default:
				break;
			}
	    }
	}

}
