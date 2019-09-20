/******************************************************************************
 *  Purpose:  Stock Data write in file
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

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class WriteStockData1 {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		
	    AddStock add = new AddStock();
	    
	   add.addStock();
	    
		
	    
//		
//		 String jsonPath = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json";
//
//		JSONObject root = new JSONObject();
//		
//	 	List<Stock> stockData = new JSONArray();
//	
//	 	System.out.println("how much list enter : ");
//		int number = Utility.scanInt();
//		
//	 	Stock stock[] = new Stock[number];
//		for(int index=0;index<number;index++) {
//			stock[index] = new Stock();
//			
//			System.out.println("Enter company name : ");
//			String stockName = Utility.scanString();
//			stock[index].setStockName(stockName);
//			
//			System.out.println("How much share of company : ");
//			int numberOfShares = Utility.scanInt();
//			stock[index].setNumberOfShares(numberOfShares);
//			
//			System.out.println("Enter one share price : ");
//			int sharePrice = Utility.scanInt();
//			stock[index].setSharePrice(sharePrice);;
//			
//			stockData.add(stock[index]);
//			
//			
//		}
//
//		
//	     int length = stockData.size();
//	     System.out.println(length);
//		root.put("stock", stockData);
//        int size =  root.size();
//         System.out.println("size"+size);
//		JsonUtility.WriteVlueFile(jsonPath,root);
		 
		// JsonUtility.prettyPrint(jsonPath, stockData);
			System.out.println("===== Done =====");
	    System.out.println("===== Add Data in file =====");

	}

}
