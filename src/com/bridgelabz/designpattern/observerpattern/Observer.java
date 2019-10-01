/******************************************************************************
 *  Purpose: create interface of observer
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.observerpattern;

public interface Observer {

	void update();

	void subscribeChanel(Channel ch);

}