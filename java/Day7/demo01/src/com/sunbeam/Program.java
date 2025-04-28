package com.sunbeam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	/* 
	//Handling the problems the programmatically 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the numerator : ");
		int num = sc.nextInt();
		System.out.print("Enter the denominator : ");
		int den = sc.nextInt();
		if(den!=0) {
			int result = num / den; 
			System.out.println("Res : "+result);
		}
		else 
			System.out.println("Divide by zero");
	}*/ 
	
	/* 
	//Handling the problems the programmatically 
	//not suitable in every approach 
	public static int divide(int num , int den) {
		if(den == 0) {
			System.out.println("Divide by zero");
			System.exit(0);
		}
		int res = num / den; 
		return res; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the numerator : ");
		int num = sc.nextInt();
		System.out.print("Enter the denominator : ");
		int den = sc.nextInt();
		int result = divide(num, den); 
		System.out.println("res : "+result);
	}
	//CODE 
   */ 
	
	/* 
	//detect the problem and throw the problem 
	public static int divide(int num , int den) {
		if(den == 0) {
			throw new RuntimeException("Divide by zero"); 
		}
		int res = num / den; 
		return res; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.print("Enter the numerator : ");
			int num = sc.nextInt();
			System.out.print("Enter the denominator : ");
			int den = sc.nextInt();
			int result = divide(num, den); 
			System.out.println("res : "+result);
		}
		catch (RuntimeException e) {
			System.out.println("Divide by zero");
		}
	} */
	
	/* 
	//detect the problem and throw the problem 
	public static int divide(int num , int den) {
		int res = num / den;// divide operator may throw ArithmeticException  
		return res; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.print("Enter the numerator : ");
			int num = sc.nextInt();
			System.out.print("Enter the denominator : ");
			int den = sc.nextInt();
			int result = divide(num, den); 
			System.out.println("res : "+result);
		}
		catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		}
		catch (InputMismatchException e) {
			System.out.println("Incorrect input");
		}
	}*/
	/* 
	//detect the problem and throw the problem 
	public static int divide(int num , int den) {
		int res = num / den;// divide operator may throw ArithmeticException  
		return res; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.print("Enter the numerator : ");
			int num = sc.nextInt();
			System.out.print("Enter the denominator : ");
			int den = sc.nextInt();
			int result = divide(num, den); 
			System.out.println("res : "+result);
		}
		catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Invalid Input");
		}
	
	}*/
	/* 
	//detect the problem and throw the problem 
		public static int divide(int num , int den) {
			int res = num / den;// divide operator may throw ArithmeticException  
			return res; 
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.print("Enter the numerator : ");
			int num = sc.nextInt();
			System.out.print("Enter the denominator : ");
			int den = sc.nextInt();
			int result = divide(num, den); 
			System.out.println("res : "+result);
			//sc.close(); // if exception occurs this line will not execute 
		}
		catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Invalid Input");
			//sc.close(); // if exception not occurs this line will not get executed 
		}
		finally {
			//we can use try-with-resource 
			sc.close(); // irrespective of exception this line will get executed  
		}
	
	}*/ 
	// detect the problem and throw the problem
	public static int divide(int num, int den) throws Exception {
		int res = num / den;// divide operator may throw ArithmeticException
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the numerator : ");
			int num = sc.nextInt();
			System.out.print("Enter the denominator : ");
			int den = sc.nextInt();
			int result = divide(num, den);
			System.out.println("res : " + result);
			// sc.close(); // if exception occurs this line will not execute
		}
		catch (Exception e) {
			System.out.println("Divide by zero");
		}
				
		} 

	}


