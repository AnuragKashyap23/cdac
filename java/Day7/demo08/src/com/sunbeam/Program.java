package com.sunbeam;

public class Program {
	//generic method using java.lang.Object -- till Java 1.4  
	public static void printObjectArray(Object[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			//Integer ele = (Integer) arr[i]; //if ele is not a Integer it will throw classcast exception
			System.out.println(arr[i]);
			//System.out.println(ele);
		}
	}
	// generic method using generic type param -- since Java 5.0)  
	public static <T> void printTypedArray(T[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			T ele = arr[i]; 
			System.out.println(ele);
		}
	}
	//generic method using bounded generic type param -- since Java 5.0 
	public static<T extends Number> void printNumberArray(T[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			T ele = arr[i]; 
			System.out.println(ele);
		}	
	}
	public static void main(String[] args) {
		
		/* 
			Object[] arr1 = {11,22,33,44,"55" , 11.33 , "Sunbeam"}; 
			printObjectArray(arr1);
			String[] arr2 = {"Aditya","Sagar","Prashant" , "Akash" , "Amit"}; 
			printObjectArray(arr2);
		*/ 
		
		 
		Integer[] arr3 = {11,22,33,44,55}; 
		printTypedArray(arr3); // T : Integer 
		
		String[] arr4 = {"Aditya","Sagar","Prashant" , "Akash" , "Amit"};
		//printTypedArray(arr4); // T : String
		//Program.<Number>printTypedArray(arr4); // NOT OK
		
		
		Double[] arr5 = {11.33, 12.33,14.44, 15.55}; 
		//printTypedArray(arr5); // T : Double 
		//Program.<Double>printTypedArray(arr5);
		 
		
		
		/* 
		Integer[] arr6 = {11,22,33,44,55};
		printNumberArray(arr6); // T:Number 
 
		String[] arr7 = {"Aditya","Sagar","Prashant" , "Akash" , "Amit"};
		//printNumberArray(arr7); // T :String ( NOT OK) 
		
		Double[] arr8 = {11.33, 12.33,14.44, 15.55};
		//printNumberArray(arr8); // OK  T : Double
		Program.printNumberArray(arr8);
		
		*/ 
	}

}
