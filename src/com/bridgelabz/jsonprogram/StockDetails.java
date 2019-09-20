package com.bridgelabz.jsonprogram;

import java.io.Serializable;
import java.util.List;

public class StockDetails implements Serializable{

	private List<Stock> stock;

	public List<Stock> getStock() {
		return stock;
	}

	public void setStock(List<Stock> stock) {
		this.stock = stock;
	}

	
}
