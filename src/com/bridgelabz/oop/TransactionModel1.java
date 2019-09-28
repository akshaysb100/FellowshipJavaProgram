/******************************************************************************
 *  Purpose: Transaction Model1
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   20-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.oop;

import java.util.List;

public class TransactionModel1 {
	private String transaction;
	private List<Transactions1> transactions;

	public List<Transactions1> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions1> transactions) {
		this.transactions = transactions;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
}
