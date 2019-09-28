/******************************************************************************
 *  Purpose: Add stock information 
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.oop;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class AddStock {
	ObjectMapper mapper = new ObjectMapper();
	List<Stock> stockList = new ArrayList<Stock>();
	public void addStock() throws JsonGenerationException, JsonMappingException, IOException {
	File file = new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockfile.json");
			if(file.length()==0)
	{
	   
	    Stock stock = new Stock();
		
			
			System.out.println("Enter company name : ");
			String stockName = Utility.scanString();
			stock.setStockName(stockName);
			System.out.println("How much share of company : ");
			int numberOfShares = Utility.scanInt();
			stock.setSharePrice(numberOfShares);
			System.out.println("Enter share price : ");
			int sharePrice = Utility.scanInt();
			stock.setNumberOfShares(sharePrice);
			stockList.add(stock);
				JsonUtility.prettyPrint(file,stockList);
	}
	else
	{
		List<Stock> tempList = new ArrayList<Stock>();
		tempList = mapper.readValue(file, new TypeReference<List<Stock>>() {});
		stockList.addAll(tempList);
		Stock stock = new Stock();
		 
				System.out.println("Enter company name : ");
				String stockName = Utility.scanString();
				stock.setStockName(stockName);
				System.out.println("How much share of company : ");
				int numberOfShares = Utility.scanInt();
				stock.setSharePrice(numberOfShares);
				System.out.println("Enter share price : ");
				int sharePrice = Utility.scanInt();
				stock.setNumberOfShares(sharePrice);
				stockList.add(stock);
				JsonUtility.prettyPrint(file,stockList);
	
	}
	}
}
