package com.sunbeam;

import java.util.Scanner;

class Shape{
	protected float area; 
	public void acceptRecord( ) {
		//TODO 
	}
	public void calculateArea( ) {
		//TODO 
	}
	public final void printRecord( ) {
		System.out.println("Area : "+area);
	}
}
class Rectangle extends Shape{
	private float length; 
	private float breadth; 
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Length : ");
		length = sc.nextFloat(); 
		System.out.println("Breadth : ");
		breadth = sc.nextFloat(); 
	}
	
	public void calculateArea() {
		this.area = this.length * this.breadth; 
	}
}
class Circle extends Shape{
	private float radius; 
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Radius : ");
		radius = sc.nextFloat(); 
	}
	
	public void calculateArea() {
		this.area = (float) (Math.PI * this.radius * this.radius); 
	}
}
public class Program {
	public static int menuList( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter the choice : ");
		return sc.nextInt(); 	
	}
	public static void main(String[] args) {
		int choice; 
		while((choice = menuList())!=0) {
			Shape shape = null;   
			switch (choice) {
			case 1:
				shape = new Rectangle(); // upcasting 
				break;
			case 2: 
				shape = new Circle(); // upcasting 
				break; 
			default:
				System.out.println("Invalid choice");
				break;
			}
			if(shape!=null) {
				shape.acceptRecord(); //dynamic method dispatch 
				shape.calculateArea();//dynamic method dispatch 
				shape.printRecord();
			}
		}

	}

}
