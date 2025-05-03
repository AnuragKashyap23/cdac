package com.sunbeam;

import java.util.Scanner;

enum Arithmetic{
	EXIT , ADDITION , SUBTRACTION , MULTIPLICATION , DIVISION 
}


public class Program {

	public static void main(String[] args) {
		int index ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result;
		Arithmetic[] arithVal = Arithmetic.values();
		for(Arithmetic ar : arithVal) {
			System.out.println(ar.ordinal() + "." + ar.name());
		}
		System.out.println("Enter the choice : ");
		index = sc.nextInt(); 
		Arithmetic choice = arithVal[index]; 
		switch (choice) {
		case ADDITION:
			result = num1 + num2;
			System.out.println("Result: " + result);
			break;
		case SUBTRACTION:
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
		case MULTIPLICATION:
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;
		case DIVISION:
			result = num1 / num2;
			System.out.println("Result: " + result);
			break;
		}

	}

}
