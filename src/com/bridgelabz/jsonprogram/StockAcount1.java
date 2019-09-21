package com.bridgelabz.jsonprogram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;


import com.bridgelabz.util.JsonUtility;
import com.bridgelabz.util.Utility;

public class StockAcount1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	
      System.out.println("Enter info  : ");
      TransactionModel1 transModel = new TransactionModel1();
		
		String pathOfTransaction = "/home/admin/seleninum/eclipse-workspace/JavaPrograms/src/com/bridgelabz/jsonfiles/stockacount.json";
		
		ArrayList<Transactions1> transList = new ArrayList<Transactions1>();
		
		File file = new File(pathOfTransaction);
		if (file.length() != 0) {
			transModel = (TransactionModel1) JsonUtility.readMapper(pathOfTransaction, transModel);
		}
		
		if (!transModel.getTransactions().isEmpty()) {
			transList.addAll(transModel.getTransactions());
		}
		
		System.out.println("Enter info : ");
		Transactions1 trans = new Transactions1();
		System.out.println("Enter first name  : ");
		String name = Utility.scanString();
		trans.setName(name);
		
		System.out.println("Enter last name : ");
		String lastname = Utility.scanString();
		trans.setLastname(lastname);
		
		System.out.println("Enter amount : ");
		int amount = Utility.scanInt();
		trans.setAmount(amount);
		
		transList.add(trans);
		
		transModel.setTransactions(transList);
		transModel.setTransaction("Tran");
		JsonUtility.writeMapper(pathOfTransaction, transModel);
	}

}
