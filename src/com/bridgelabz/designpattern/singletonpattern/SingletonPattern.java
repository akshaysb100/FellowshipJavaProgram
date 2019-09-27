package com.bridgelabz.designpattern.singletonpattern;

import java.lang.reflect.Constructor;

public class SingletonPattern {

	public static void main(String[] args) {
		
		 // Eager Initialized Singleton
		
		  EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		  int in =instanceOne.hashCode();
		  System.out.println(""+in);
		  EagerInitializedSingleton instanceOne2 = null;

		  EagerInitializedSingleton instanceOne1 = EagerInitializedSingleton.getInstance();
		  int in1 = instanceOne1.hashCode();
		  System.out.println(""+in1);
		  
		  if(instanceOne==instanceOne2)
		  {
			  System.out.println("true");
		  }else
		  {
			  System.out.println("false");
		  }
		  System.out.println();
		  
		  SimpleClass sl = new SimpleClass();
		  int sl1 = sl.hashCode();
		  System.out.println(sl1);
		  
		  SimpleClass sl12 = new SimpleClass();
		  int sl11 = sl12.hashCode();
		  System.out.println(sl11);
		  
//		  EagerInitializedSingleton instanceOne1 = new EagerInitializedSingleton();
//		  EagerInitializedSingleton instanceOne2 = new EagerInitializedSingleton();
//		  EagerInitializedSingleton instanceOne3 = new EagerInitializedSingleton();
		  
		  
		  //
		  
	}
}
