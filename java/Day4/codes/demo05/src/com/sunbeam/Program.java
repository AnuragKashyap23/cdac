package com.sunbeam;


public class Program {
	static int number = 10; // OK 
	public static void printNumber( ) {
		//static int number = 10; // NOT OK (static variable should be declared in class Scope)
		number++; 
		System.out.println("num : "+number);
	}
	public static void main(String[] args) {
		//static int number = 10; // NOT OK
		Program.printNumber(); //11 
		Program.printNumber(); //12 
		Program.printNumber(); //13
	}

}
