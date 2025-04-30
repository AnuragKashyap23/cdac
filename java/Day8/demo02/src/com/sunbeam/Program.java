package com.sunbeam;

public class Program {
	public static <T> void swap(T a, T b) {
		T temp = a; 
		a = b; 
		b = temp; 
		System.out.println(" a : " + a + " b : " + b);
	}
	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "B"; 
		//swap(s1,s2); // T : String 
		
		Integer i = 10; 
		Double d = 11.33; // T : Number 
		//swap(i,d); 
		
		//Program.<Double>swap(i, d); // ERROR 
		//Integer is not coverted to Double 
	}

}
