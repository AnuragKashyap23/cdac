package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.domain.Employee;
import com.util.CompareByEmpid;
import com.util.CompareByName;
import com.util.CompareBySalary;

public class Program {
	public static Employee[] getEmployees( ) {
		Employee[] arr = new Employee[4]; 
		arr[0] = new Employee(3, "Aditya", 3000.00); 
		arr[1] = new Employee(2, "Prasant", 4000.00); 
		arr[2] = new Employee(1, "Sagar", 2000.00); 
		arr[3] = new Employee(4, "Omkar", 1000.00); 
		return arr; 
	}
	public static void print(Employee[] arr , Comparator<Employee> cmp) {
		Arrays.sort(arr, cmp); 
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int menuList( ) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("0.Exit");
		System.out.println("1.CompareByEmpid");
		System.out.println("2.CompareByName");
		System.out.println("3.CompareBySalary");
		System.out.print("Enter the choice : ");
		return sc.nextInt(); 
	}
	public static void main(String[] args) {
		int choice; 
		Employee[] arr = Program.getEmployees(); 
		while((choice = menuList())!=0) {
			Comparator<Employee> comparator = null; 
			switch (choice) {
			case 1:
				comparator = new CompareByEmpid( ); 
				break;
			case 2: 
				comparator = new CompareByName( ); 
				break; 
			case 3: 
				comparator = new CompareBySalary( ); 
				break; 
			default:
				System.out.println("Invalid choice");
				break;
			}
			Program.print(arr, comparator);
		}

	}

}
