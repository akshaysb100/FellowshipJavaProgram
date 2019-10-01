/******************************************************************************
 *  Purpose: Interface of accept bill payment
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.visitordesign;

public interface ItemElement {
    
	public int accept(ShoppingCartVisitor visitor); 
}
