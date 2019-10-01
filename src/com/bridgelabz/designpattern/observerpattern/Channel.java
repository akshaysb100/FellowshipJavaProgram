/******************************************************************************
 *  Purpose: List of subscribers
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subscriber> sub = new ArrayList<>();
	String title;
	
	@Override
	public void subscribers(Subscriber subscriber) {
		sub.add(subscriber);
	}
	
	@Override
	public void unsubscriber(Observer unsuSubscriber) {
		sub.remove(unsuSubscriber);
	}
	
	@Override
	public void notifySubscriber() {
		for(Observer subs : sub) {
			subs.update();
		}
	}
	
	
	@Override
	public void upload(String title){
          this.title = title;
          notifySubscriber();
	}
	
}
