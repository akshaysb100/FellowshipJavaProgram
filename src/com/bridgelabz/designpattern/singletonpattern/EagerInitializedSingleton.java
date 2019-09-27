package com.bridgelabz.designpattern.singletonpattern;

public class EagerInitializedSingleton {
	static int i=0;
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){
    	
    	System.out.println(i++);
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
