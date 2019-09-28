/******************************************************************************
 *  Purpose:  Stock Data write in file
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.oop;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class WriteStockData1 {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		
	    AddStock add = new AddStock();
	    add.addStock();
	
	    System.out.println("===== Add Data in file =====");

	}

}
