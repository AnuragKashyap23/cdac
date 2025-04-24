package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Date dt1 = new Date(1, 1, 2020); 
		System.out.println("Dt1 : "+dt1.toString());
		//d1 = com.sunbeam.Date@3d012ddd <-- when not overridden
		//Object.toString() returns class name @ hashcode in hex
		// d1 = 6-2-2024 <-- to get state of object, override the method in the class

	}

}
