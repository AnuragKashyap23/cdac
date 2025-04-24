package com.sunbeam;
public class Program{
	 
	public static void arrayPrint(Object... arr) {
		 
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]); 
		}
		 
	}
	public static void main(String[] args) {
		Program.arrayPrint(11.33,"Hello", 12);
	}
}
/* 
public class Program{
	//variable arity method --- java 5.0 
	public static double arraySum(double... arr) {
		double total = 0.0; 
		for(int i = 0 ; i < arr.length ; i++) {
			total = total + arr[i]; 
		}
		return total; 
	}
	public static void main(String[] args) {
		double r1 = Program.arraySum(1.1,2.1,3.1); 
		System.out.println("r1 : "+r1);
		
		double r2 = Program.arraySum(5.1,5.2,5.3); 
		System.out.println("r2 : "+r2);
		
		double r3 = Program.arraySum(new double[] {1.1,2.1,3.1}); //annonymous array 
		System.out.println("r3 : "+r3);
	}
}*/ 
/* 
public class Program{
	public static double arraySum(double[] arr) {
		double total = 0.0; 
		for(int i = 0 ; i < arr.length ; i++) {
			total = total + arr[i]; 
		}
		return total; 
	}
	public static void main(String[] args) {
		double[] arr1 = {1.1,2.1,3.1}; //named array 
		double r1 = Program.arraySum(arr1); 
		System.out.println("r1 : "+r1);
		
		double[] arr2 = {5.1,5.2,5.3}; // named array  
		double r2 = Program.arraySum(arr2); 
		System.out.println("r2 : "+r2);
		
		double r3 = Program.arraySum(new double[] {1.1,2.1,3.1}); //annonymous array 
		System.out.println("r3 : "+r3);
	}
}
*/ 
/* 
public class Program {
	
	public static void sum(int a , int b) {
		int sum = a +  b; 
		System.out.println("Sum : "+sum);
	}
	public static void sum(int a , int b , int c) {
		int sum = a +  b + c; 
		System.out.println("Sum : "+sum);
	}
	public static void sum(int a , int b , int c , int d) {
		int sum = a +  b + c + d; 
		System.out.println("Sum : "+sum);
	}
	public static void main(String[] args) {
		Program.sum(10, 20);
		Program.sum(10, 20,30);
		Program.sum(10, 20,30,40);
	}

}*/ 
