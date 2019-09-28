/******************************************************************************
 *  Purpose : Customer information Model
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   22-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.oop;

import java.util.List;

public class CustomerinfoModel {
	private List<Customerinfo> Customerinfo;

	public List<Customerinfo> getCustomerinfo() {
		return Customerinfo;
	}

	public void setCustomerinfo(List<Customerinfo> customerinfo) {
		Customerinfo = customerinfo;
	}
}
