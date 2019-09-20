package com.bridgelabz.jsonprogram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.JsonUtility;

public class Practice {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Stock> stockList = new ArrayList<Stock>();
		
		File file = new File("/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/suraj.json");
		if(file.length()==0)
		{
			Stock stock = new Stock();
			stock.setStockName("Abc");
			stock.setSharePrice(100);
			stock.setNumberOfShares(1000);
			stockList.add(stock);
			JsonUtility.prettyPrint(file,stockList);
			
			
		}
		else
		{
			List<Stock> tempList = new ArrayList<Stock>();
			tempList = mapper.readValue(file, new TypeReference<List<Stock>>() {});
			stockList.addAll(tempList);
			Stock stock = new Stock();
			stock.setStockName("Abc");
			stock.setSharePrice(100);
			stock.setNumberOfShares(1000);
			stockList.add(stock);
			JsonUtility.prettyPrint(file,stockList);
		}

	}

}
