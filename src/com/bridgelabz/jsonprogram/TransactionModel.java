/******************************************************************************
 *  Purpose: Transaction Model
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.jsonprogram;

import java.io.Serializable;
import java.util.List;

public class TransactionModel implements Serializable {
	private String transaction;
	private List<Transactions> transactions;

	
	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
}
