package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
	private int empid; 
	private String name; 
	private double salary; 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.empid - o.empid; 
	}
	
}
class CompareByEmpid implements Comparator<Employee>{
	@Override
	public int compare(Employee x, Employee y) {
		 return x.getEmpid() - y.getEmpid(); 
	}
}
class CompareByName  implements Comparator<Employee>{

	@Override
	public int compare(Employee x, Employee y) {
		return x.getName().compareTo(y.getName());  
	}
	
}
class CompareBySalary  implements Comparator<Employee>{
	@Override
	public int compare(Employee x, Employee y) {
		return (int) (x.getSalary() - y.getSalary()); 
	}
}
public class Program {
	
	public static void print(Employee[] arr , Comparator<Employee> cmp) {
		Arrays.sort(arr, cmp); 
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Employee[] arr = new Employee[4]; 
		arr[0] = new Employee(3, "Aditya", 3000.00); 
		arr[1] = new Employee(2, "Prasant", 4000.00); 
		arr[2] = new Employee(1, "Sagar", 2000.00); 
		arr[3] = new Employee(4, "Omkar", 1000.00); 
		
		//Program.print(arr, new CompareByEmpid());
		
		//Program.print(arr, new CompareByName());
		
		//Program.print(arr, new CompareBySalary());
		
		Program.print(arr, null);
		//A null value indicates that the elements' natural ordering should be used.
	}

}
