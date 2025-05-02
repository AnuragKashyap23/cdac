package com.sunbeam;

@FunctionalInterface
public interface Shape {
	/*public static final*/double PI = 3.14; 
	/*public abstract*/double calcArea( );
	// java8 allows to write default methods in interface 
	default double calcPeri( ) {
		return 0.0; 
	}
	//java8 allows to write static methods inside the interface 
	public static double calculateTotalArea(Shape[] arr) {
		double sum = 0; 
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i].calcArea(); 
		}
		return sum; 
	}
}

/*
class Shapes{
	
}
*/ 