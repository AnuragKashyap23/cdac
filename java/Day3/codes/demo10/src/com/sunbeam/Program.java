package com.sunbeam;

public class Program {
	
	/* 
	public static void swap(int a, int b) {
		int temp = a; 
		a = b; 
		b = temp; 
		System.out.println(" a " + a + " b " + b);
	}
	public static void main(String[] args) {
		int a = 10 , b = 20; 
		swap(a,b); 
		System.out.println(" a " + a + " b " + b);
	}*/ 
	
	public static void swap(int[] a) {
		int temp = a[0]; 
		a[0] = a[1]; 
		a[1] = temp; 
		System.out.println(" a[0] " + a[0] + " a[1] " + a[1]);
	}
	public static void main(String[] args) {
		int[] a = {10,20}; 
		Program.swap(a); 
		System.out.println(" a[0] " + a[0] + " a[1] " + a[1]);
	}

}
