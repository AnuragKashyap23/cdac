package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); 
		System.out.println("square : "+num * num);

	}
	public static void main2(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value: ");
		int num = sc.nextInt(); 
		System.out.println("square : "+num * num);
		sc.close();
	}
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value: ");
			int num = sc.nextInt(); 
			System.out.println("square : "+num * num);
			
		}
		finally {
			System.out.println("Resource closed");
			sc.close();
		}
	}
	public static void main4(String[] args) {
		//try-with-resource 
		// it will work with any class which is implementing Autocloseable interface
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the value: ");
			int num = sc.nextInt(); 
			System.out.println("square : "+num * num);
		}//sc.close(); automatically 
	}
	public static void main(String[] args) {
		class MyResource implements AutoCloseable{
			public MyResource() {
				System.out.println("MyResource created");
			}

			@Override
			public void close() {
				System.out.println("Resource closed");
				
			}
		}
		//try-with-resource 
		try(MyResource myResource = new MyResource()){
			System.out.println("MyResource used");
		}//myResource.close(); 
	}

}
