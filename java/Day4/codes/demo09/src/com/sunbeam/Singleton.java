package com.sunbeam;
//Singleton class 
public class Singleton {
	//single copy will be created 
	private static Singleton obj;
	static {
		// as static block is executed once, only one object is created
		obj = new Singleton( ); 
	}
	//we don't want to create the object outside the class 
	private Singleton() {
		System.out.println("Constructor called");
	}
	 // static getter method so that users can access the object
	public static Singleton getInstance() {
		return obj;
	}
}
