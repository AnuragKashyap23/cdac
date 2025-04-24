package com.sunbeam;

import static com.sunbeam.Chair.setPrice; 
import static com.sunbeam.Chair.getPrice;
import static java.lang.Math.*;

import java.util.Scanner;
//import all static members (fields + methods) from the Math class
public class Program {
	public static double calcArea(double rad) {
		//return Math.PI * rad * rad;
		return PI * rad * rad;
	}
	public static void main(String[] args) {
		System.out.println("Price : "+Chair.getPrice()); 
		//Chair.setPrice(500);
		//System.out.println("Price : "+Chair.getPrice());
		setPrice(1000); 
		//System.out.println("Price : "+getPrice());
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the rad : ");
		double radius = sc.nextDouble(); 
		//double area = Program.calcArea(radius);
		double area = calcArea(radius);// calcArea is static can be called directly
		System.out.println("Area : "+area);
		
		 
		
	}

}
