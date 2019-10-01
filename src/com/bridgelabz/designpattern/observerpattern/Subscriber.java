/******************************************************************************
 *  Purpose: Subscriber information
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.observerpattern;

public class Subscriber implements Observer {
 
	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		//super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("hey "+name+", Video uploaded "+channel.title);
	}
	
	@Override
	public void subscribeChanel(Channel ch) {
		channel = ch;
	}
}
