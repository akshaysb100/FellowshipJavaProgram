/******************************************************************************
 *  Purpose : Create Youtube Channel information using observer pattern
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   30-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.observerpattern;

public class Youtube {

	public static void main(String[] args) {
		
            Channel newChannel = new Channel();
            
            Subscriber sb1 = new Subscriber("Akshay");
            Subscriber sb2 = new Subscriber("umesh");
            Subscriber sb3 = new Subscriber("rohit");
            Subscriber sb4 = new Subscriber("tushar");
            
            newChannel.subscribers(sb1);
            newChannel.subscribers(sb2);
            newChannel.subscribers(sb3);
            newChannel.subscribers(sb4);
            
            sb1.subscribeChanel(newChannel);
            sb2.subscribeChanel(newChannel);
            sb3.subscribeChanel(newChannel);
            sb4.subscribeChanel(newChannel);
          
            newChannel.upload("How to learn programing??");

            System.out.println();
            newChannel.unsubscriber(sb2);
           
            newChannel.upload("How to learn programing??");

	}

}
