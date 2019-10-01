/******************************************************************************
 *  Purpose: Visitor information
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.visitordesign;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
