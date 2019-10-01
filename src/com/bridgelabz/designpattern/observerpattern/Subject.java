/******************************************************************************
 *  Purpose: Creat Interface of subject
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.observerpattern;

public interface Subject {

	void subscribers(Subscriber subscriber);

	void unsubscriber(Observer unsuSubscriber);

	void notifySubscriber();

	void upload(String title);

}