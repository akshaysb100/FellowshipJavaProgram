package com.bridgelabz.designpattern.visitordesign;

public interface ItemElement {
    
	public int accept(ShoppingCartVisitor visitor); 
}
