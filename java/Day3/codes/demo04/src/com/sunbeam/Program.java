package com.sunbeam;

import java.util.Scanner;

public class Program {
	public static void acceptRecord(int[] arr) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the array elements : ");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt(); 
		}
	}
	public static void printRecord(int[] arr) {
		System.out.println("Array elements are : "); 
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]); 
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[3]; 
		Program.acceptRecord(arr);
		Program.printRecord(arr);
	}
	public static void main4(String[] args) {
		int[] arr = new int [3];// java.lang.ArrayIndexOutOfBoundsException 
		System.out.println(arr[-1]);
	}
	public static void main3(String[] args) {
		int[] arr = new int[-3]; //java.lang.NegativeArraySizeException
	}
	public static void main2(String[] args) {
		int[] arr; // reference 
		arr = new int[3]; // OK 
		arr[0] = 10; 
		arr[1] = 20; 
		arr[2] = 30; 
		for(int ele : arr) {
			System.out.println(ele);
		}
	}
	public static void main1(String[] args) {
		//int[] arr = null; // OK
		//int arr[] = null; // OK

	}
}
