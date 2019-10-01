/******************************************************************************
 *  Purpose : LazyInitialized Singleton
 *  
 *  @author  Akshay
 *  @version 1.0
 *  @since   27-09-2019
 *
 *******************************************************************************/
package com.bridgelabz.designpattern.singletonpattern;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	private LazyInitializedSingleton(){}
	    
	    public static LazyInitializedSingleton getInstance(){
	        if(instance == null){
	            instance = new LazyInitializedSingleton();
	        }
	        return instance;
	    }
}
